<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Transaction History</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<h2>Transaction History</h2>
<table border="1">
    <tr>
        <th>Transaction ID</th>
        <th>Sender Account</th>
        <th>Recipient Account</th>
        <th>Amount</th>
        <th>Timestamp</th>
    </tr>
    <%
        // Assuming you have a method in TransactionHistoryDAO to get transaction history
        List<TransactionHistoryDTO> transactionHistory = (List<TransactionHistoryDTO>) request.getAttribute("transactionHistory");

        // Format timestamp for display
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (TransactionHistoryDTO transaction : transactionHistory) {
    %>
        <tr>
            <td><%= transaction.getTransactionId() %></td>
            <td><%= transaction.getSenderAccountNumber() %></td>
            <td><%= transaction.getRecipientAccountNumber() %></td>
            <td><%= transaction.getAmount() %></td>
            <td><%= sdf.format(transaction.getTimestamp()) %></td>
        </tr>
    <%
        }
    %>
</table>

<!-- Include Bootstrap JS and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
