/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
// TransferServlet.java
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/TransferServlet")
public class TransferServlet2 extends HttpServlet {
    private final AccountDAO accountDAO = new AccountDAO();
    private final TransactionDAO transactionDAO = new TransactionDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String senderAccountNumber = request.getParameter("senderAccountNumber");
        String recipientAccountNumber = request.getParameter("recipientAccountNumber");
        double amount = Double.parseDouble(request.getParameter("amount"));

        // Retrieve accounts from the database using DAO
        AccountDTO sender = null;
        AccountDTO recipient = null;
        try {
            sender = accountDAO.getAccountByNumber(senderAccountNumber);
            recipient = accountDAO.getAccountByNumber(recipientAccountNumber);
        } catch (SQLException ex) {
            Logger.getLogger(TransferServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (sender != null && recipient != null) {
            // Check if sender has sufficient balance
            if (sender.getBalance() >= amount) {
                // Perform money transfer
                performMoneyTransfer(sender, recipient, amount);

                // Update database with new balances using DAO
                accountDAO.updateAccountBalance(sender);
                accountDAO.updateAccountBalance(recipient);

                // Add transaction to the transaction history
                TransactionDTO transaction = new TransactionDTO();
                transaction.setSenderAccountNumber(senderAccountNumber);
                transaction.setRecipientAccountNumber(recipientAccountNumber);
                transaction.setAmount(amount);
                transaction.setTimestamp(new Timestamp(System.currentTimeMillis()));

                if (transactionDAO.addTransaction(transaction)) {
                    // Transaction added successfully
                    request.setAttribute("errorMessage", "Success Transfer Money");

                    // Retrieve and set transaction history for display
                    List<TransactionDTO> transactionHistory = transactionDAO.getTransactionHistory(senderAccountNumber);
                    request.setAttribute("transactionHistory", transactionHistory);

                    // Forward to transfer.jsp
                    request.getRequestDispatcher("transfer.jsp").forward(request, response);
                } else {
                    // Failed to add transaction
                    request.setAttribute("errorMessage", "Failed to record transaction");
                    request.getRequestDispatcher("transfer.jsp").forward(request, response);
                }
            } else {
                // Display an error message in a Bootstrap modal
                request.setAttribute("errorMessage", "Insufficient balance in the sender's account");
                request.getRequestDispatcher("transfer.jsp").forward(request, response);
            }
        } else {
            // Handle invalid account numbers (e.g., display an error page)
            request.setAttribute("errorMessage", "Transfer Money Fail");
            request.getRequestDispatcher("transfer.jsp").forward(request, response);
        }
    }

    private void performMoneyTransfer(AccountDTO sender, AccountDTO recipient, double amount) {
        // Implement money transfer logic in the DTOs
        if (amount > 0 && sender.getBalance() >= amount) {
            sender.setBalance(sender.getBalance() - amount);
            recipient.setBalance(recipient.getBalance() + amount);
        }
    }
}
