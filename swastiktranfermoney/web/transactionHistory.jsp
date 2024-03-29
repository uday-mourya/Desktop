<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.transfer.model.*"%>
<%@ page import="java.time.LocalDateTime"%>
<%@ page import="java.time.format.DateTimeFormatter"%>

<%@ page import="java.io.ByteArrayOutputStream"%>
<%@ page import="com.itextpdf.text.Document"%>
<%@ page import="com.itextpdf.text.Paragraph"%>
<%@ page import="com.itextpdf.text.pdf.PdfWriter"%>

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

    <div class="container mt-5">
        <h2>Transaction History</h2>
        <table class="table table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>Transaction ID</th>
                    <th>Sender Account</th>
                    <th>Recipient Account</th>
                    <th>Amount</th>
                    <th>Timestamp</th>
                </tr>
            </thead>
            <tbody>
                <%      
                    List<TransactionDTO> transactionHistory = (List<TransactionDTO>) session.getAttribute("transactionHistory");
//                    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    for (TransactionDTO transaction : transactionHistory) {
                %>
                <tr>
                    <td><%= transaction.getTransactionId() %></td>
                    <td><%= transaction.getSenderAccountNumber() %></td>
                    <td><%= transaction.getRecipientAccountNumber() %></td>
                    <td><%= transaction.getAmount() %></td>
                    <td><%= transaction.getTimestamp()%></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
<div class="container mt-5">
        <h2>Transaction History</h2>
        <a href="<%= request.getContextPath() %>/DownloadPDFServlet">Download as PDF</a>
        <table class="table table-bordered">
            <!-- ... your existing table code ... -->
        </table>
    </div>

    <!-- Include Bootstrap JS and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
