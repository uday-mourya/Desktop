<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<h2>Money Transfer</h2>
    <form action="TransferServlet2" method="post">
        <label for="senderAccountNumber">Sender's Account Number:</label>
        <input type="text" id="senderAccountNumber" name="senderAccountNumber" required><br>

        <label for="recipientAccountNumber">Recipient's Account Number:</label>
        <input type="text" id="recipientAccountNumber" name="recipientAccountNumber" required><br>

        <label for="amount">Transfer Amount:</label>
        <input type="number" id="amount" name="amount" step="0.01" required><br>

        <input type="submit" value="Transfer Money">
    </form>

<form action="TransactionHistoryServlet" method="post">
        <label for="senderAccountNumber">Sender's Account Number:</label>
        <input type="text" id="senderAccountNumber" name="accountNumber" required><br>

        <input type="submit" value="Submit">
    </form>
<!-- Bootstrap Modal -->
<div class="modal fade" id="errorModal" tabindex="-1" role="dialog" aria-labelledby="errorModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="errorModalLabel">Error</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <!-- Display the error message received from the servlet -->
                <p>${errorMessage}</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>

<!-- Include Bootstrap JS and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<!-- Script to open the Bootstrap modal when the page loads -->
<script>
    // Check if the error message exists (indicating insufficient balance) and open the modal
    $(document).ready(function () {
        <% if (request.getAttribute("errorMessage") != null) { %>
            $('#errorModal').modal('show');
        <% } %>
    });
</script>

</body>
</html>
