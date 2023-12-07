<%-- 
    Document   : transaction
    Created on : Dec 6, 2023, 12:31:48 PM
    Author     : dell
--%>

<!-- transfer.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="java.sql.Timestamp" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="your.package.name.TransactionDTO" %>
<%@ page import="your.package.name.TransactionDAO" %>

<%
    // Assuming you have a method in TransactionDAO to get transaction history
    List<TransactionDTO> transactionHistory = (List<TransactionDTO>) request.getAttribute("transactionHistory");

    // Format timestamp for display
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>

<!DOCTYPE html>
<html>
<head>
    <!-- Head section of your HTML -->
</head>
<body>

<!-- Your existing HTML content -->

<!-- Display Transaction History -->
<h2>Transaction History</h2>
<table border="1">
    <tr>
        <th>Transaction ID</th>
        <th>Sender Account</th>
        <th>Recipient Account</th>
        <th>Amount</th>
        <th>Timestamp</th>
    </tr>
    <% for (TransactionDTO transaction : transactionHistory) { %>
        <tr>
            <td><%= transaction.getTransactionId() %></td>
            <td><%= transaction.getSenderAccountNumber() %></td>
            <td><%= transaction.getRecipientAccountNumber() %></td>
            <td><%= transaction.getAmount() %></td>
            <td><%= sdf.format(transaction.getTimestamp()) %></td>
        </tr>
    <% } %>
</table>

<!-- Your existing HTML content -->

</body>
</html>

