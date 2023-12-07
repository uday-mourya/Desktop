package com.transfer.model;

// TransactionDAO.java
import com.transfer.model.TransactionDTO;
import com.transfer.service.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {

    public boolean addTransaction(TransactionDTO transaction) {
        Connection con = DatabaseConnection.getConnectin();
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            String query = "INSERT INTO transactions (sender_account, recipient_account, amount) VALUES (?, ?, ?)";
            psmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            psmt.setString(1, transaction.getSenderAccountNumber());
            psmt.setString(2, transaction.getRecipientAccountNumber());
            psmt.setDouble(3, transaction.getAmount());
//            psmt.setTimestamp(4, transaction.getTimestamp());

            int affectedRows = psmt.executeUpdate();
            if (affectedRows > 0) {
                rs = psmt.getGeneratedKeys();
                if (rs.next()) {
                    transaction.setTransactionId(rs.getInt(1));
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources (ResultSet, PreparedStatement, and Connection)
            // Handle exceptions appropriately
        }
        return false;
    }

    public List<TransactionDTO> getTransactionHistory(String accountNumber) {
        List<TransactionDTO> transactionHistory = new ArrayList<>();
        Connection con = DatabaseConnection.getConnectin();
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM transactions WHERE sender_account = ? ORDER BY timestamp DESC";
            psmt = con.prepareStatement(query);
            psmt.setString(1, accountNumber);

            rs = psmt.executeQuery();

            while (rs.next()) {
                TransactionDTO transaction = new TransactionDTO();
                transaction.setTransactionId(rs.getInt("transaction_id"));
                transaction.setSenderAccountNumber(rs.getString("sender_account"));
                transaction.setRecipientAccountNumber(rs.getString("recipient_account"));
                transaction.setAmount(rs.getDouble("amount"));
                 transaction.setTimestamp(rs.getString("timestamp"));
//                transaction.setTimestamp(rs.getTimestamp("timestamp"));

                transactionHistory.add(transaction);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        System.out.println(transactionHistory + "dzfzdfdf");

        return transactionHistory;
    }
}
