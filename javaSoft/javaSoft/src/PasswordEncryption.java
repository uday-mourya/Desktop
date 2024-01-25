/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T460
 */
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.spec.KeySpec;
import java.util.Base64;

public class PasswordEncryption {

    public static String encrypt(String password, String plainText) throws Exception {
        // Generate a key based on the password
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

    public static void main(String[] args) {
        try {
       
            String password = "your_password_here";
            String plainText = "Hello, world!";

            // Encrypt the plaintext
            String encryptedText = encrypt(password, plainText);
            System.out.println("Encrypted: " + encryptedText);

            // Decrypt the encrypted text
            String decryptedText = decrypt(password, encryptedText);
            System.out.println("Decrypted: " + decryptedText);
        } catch (Exception e) {
        }
    }
}

