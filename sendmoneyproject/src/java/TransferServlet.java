// TransferServlet.java
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/TransferServlet")
public class TransferServlet extends HttpServlet {
    private final AccountDAO accountDAO = new AccountDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String senderAccountNumber = request.getParameter("senderAccountNumber");
        String recipientAccountNumber = request.getParameter("recipientAccountNumber");
        double amount = Double.parseDouble(request.getParameter("amount"));

        // Retrieve accounts from the database using DAO
        AccountDTO sender = null;
        try {
            sender = accountDAO.getAccountByNumber(senderAccountNumber);
        } catch (SQLException ex) {
            Logger.getLogger(TransferServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        AccountDTO recipient = null;
        try {
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

                // Redirect to a success page or display a success message
                request.setAttribute("errorMessage", "Sucess Transfer Money");
                request.getRequestDispatcher("transfer.jsp").forward(request, response);
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
