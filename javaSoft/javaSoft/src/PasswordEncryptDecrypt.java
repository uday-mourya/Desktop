/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T460
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class PasswordEncryptDecrypt {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String originalPassword = scanner.nextLine();

        // Encrypt the password using SHA-256
        String hashedPassword = hashPassword(originalPassword);
        System.out.println("Hashed Password: " + hashedPassword);

        // Simulate the login process
        System.out.print("Enter the password for verification: ");
        String enteredPassword = scanner.nextLine();

        // Verify the entered password
        if (verifyPassword(enteredPassword, hashedPassword)) {
            System.out.println("Password is correct. Welcome!");
        } else {
            System.out.println("Incorrect password. Access denied.");
        }

        scanner.close();
    }

    private static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digest.digest(password.getBytes(StandardCharsets.UTF_8));

        StringBuilder hexString = new StringBuilder(2 * encodedHash.length);
        for (byte b : encodedHash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    }

    private static boolean verifyPassword(String enteredPassword, String hashedPassword) throws NoSuchAlgorithmException {
        String enteredPasswordHash = hashPassword(enteredPassword);
        return enteredPasswordHash.equals(hashedPassword);
    }
}
