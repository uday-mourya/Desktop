/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T460
 */
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class SecureDatabaseExample {

    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sales?UseSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Aman@8271";

    public static void main(String[] args) {
        try {
            
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            
            createTable(connection);

          
            String password = "your_password_here";
            String plainText = "Hello, world!";

           
            String encryptedText = encrypt(password, plainText);

            insertData(connection, encryptedText);

            // Retrieve the encrypted data from the database
            String retrievedData = retrieveData(connection);

            // Decrypt the retrieved data
            String decryptedData = decrypt(password, retrievedData);

            // Display the results
            System.out.println("Original data: " + plainText);
            System.out.println("Encrypted data stored in the database: " + encryptedText);
            System.out.println("Decrypted data retrieved from the database: " + decryptedData);

            // Close the database connection
            connection.close();
        } catch (Exception e) {
        }
    }

    private static void createTable(Connection connection) throws Exception {
        String createTableQuery = "CREATE TABLE IF NOT EXISTS encrypted_data (id INT PRIMARY KEY AUTO_INCREMENT, data TEXT)";
        try (PreparedStatement statement = connection.prepareStatement(createTableQuery)) {
            statement.execute();
        }
    }

    private static void insertData(Connection connection, String encryptedText) throws Exception {
        String insertQuery = "INSERT INTO encrypted_data (data) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(insertQuery)) {
            statement.setString(1, encryptedText);
            statement.execute();
        }
    }

    private static String retrieveData(Connection connection) throws Exception {
        String selectQuery = "SELECT data FROM encrypted_data";
        try (PreparedStatement statement = connection.prepareStatement(selectQuery);
             ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                return resultSet.getString("data");
            }
            return null;
        }
    }

    public static String encrypt(String password, String plainText) throws Exception {
        
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        KeySpec spec = new PBEKeySpec(password.toCharArray(), new byte[16], 65536, 256);
        SecretKey tmp = factory.generateSecret(spec);
        SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

        // Initialize the cipher
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secret);

        // Encrypt the plaintext
        byte[] encrypted = cipher.doFinal(plainText.getBytes("UTF-8"));

        // Encode the encrypted bytes to Base64 for easy storage or transmission
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public static String decrypt(String password, String encryptedText) throws Exception {
        // Generate a key based on the password
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        KeySpec spec = new PBEKeySpec(password.toCharArray(), new byte[16], 65536, 256);
        SecretKey tmp = factory.generateSecret(spec);
        SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

        // Initialize the cipher
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secret);

        // Decode the Base64 string and decrypt
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedText));

        // Convert the decrypted bytes to a string
        return new String(decrypted, "UTF-8");
    }
}

