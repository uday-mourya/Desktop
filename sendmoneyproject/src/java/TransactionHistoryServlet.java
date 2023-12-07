// TransactionHistoryServlet.java
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TransactionHistoryServlet")
public class TransactionHistoryServlet extends HttpServlet {
    private final TransactionHistoryDAO transactionHistoryDAO = new TransactionHistoryDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accountNumber = request.getParameter("accountNumber");

        if (accountNumber != null && !accountNumber.isEmpty()) {
            try {
                List<TransactionHistoryDTO> transactionHistory = transactionHistoryDAO.getTransactionHistory(accountNumber);
                request.setAttribute("transactionHistory", transactionHistory);

                // Forward to your JSP page for displaying the transaction history
                request.getRequestDispatcher("transaction.jsp").forward(request, response);
            } catch (SQLException e) {
                // Handle database exception appropriately
                e.printStackTrace();
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error fetching transaction history");
            }
        } else {
            // Handle missing or empty account number
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing or invalid account number");
        }
    }
}
