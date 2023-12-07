package com.transfer.controller;


import com.transfer.model.TransactionDAO;
import com.transfer.model.TransactionDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/TransactionHistoryServlet")
public class TransactionHistoryServlet extends HttpServlet {

    private final TransactionDAO transactionHistoryDAO = new TransactionDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accountNumber = request.getParameter("accountNumber");

        if (accountNumber != null && !accountNumber.isEmpty()) {
            HttpSession session = request.getSession();
            List<TransactionDTO> transactionHistory = transactionHistoryDAO.getTransactionHistory(accountNumber); // Handle the exception appropriately in your application
            session.setAttribute("transactionHistory", transactionHistory);
            request.getRequestDispatcher("transactionHistory.jsp").forward(request, response);
        } else {
            // Handle invalid account number (e.g., display an error page)
            request.setAttribute("errorMessage", "Invalid account number");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}
