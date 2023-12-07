/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TransactionHistoryDAO {
    private Connection connection;

    // Constructor to initialize the connection (you can implement this based on your database connection method)

    // Get transaction history for a specific account number
    public List<TransactionHistoryDTO> getTransactionHistory(String accountNumber) throws SQLException {
        List<TransactionHistoryDTO> transactionHistory = new ArrayList<>();

        try {
            String sql = "SELECT * FROM transactions WHERE sender_account_number = ? OR recipient_account_number = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, accountNumber);
                statement.setString(2, accountNumber);

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        TransactionHistoryDTO transaction = new TransactionHistoryDTO();
                        transaction.setTransactionId(resultSet.getInt("transaction_id"));
                        transaction.setSenderAccountNumber(resultSet.getString("sender_account_number"));
                        transaction.setRecipientAccountNumber(resultSet.getString("recipient_account_number"));
                        transaction.setAmount(resultSet.getDouble("amount"));
                        transaction.setTimestamp(resultSet.getTimestamp("timestamp"));
                        transactionHistory.add(transaction);
                    }
                }
            }
        } catch (SQLException e) {
            throw e; // Handle the exception appropriately in your application
        }

        return transactionHistory;
    }

    // Other methods as needed
}
