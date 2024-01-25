package com.transfer.controller;

import com.itextpdf.text.BaseColor;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.transfer.model.TransactionDTO;
import java.net.URL;

import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;

public class DownloadPDFServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=transaction_history.pdf");

        List<TransactionDTO> transactionHistory = (List<TransactionDTO>) request.getSession().getAttribute("transactionHistory");

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();

            Font titleFont = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD, BaseColor.BLUE);
            Font detailFont = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, BaseColor.BLACK);

            // Add name and details above the table
//    document.add(new Paragraph("Name: " + transactionHistory.get(0).getName(), titleFont));
//    document.add(new Paragraph("Account Number: " + transactionHistory.get(0).SenderAccountNumber(), detailFont));
            document.add(new Paragraph("Sender Account: " + transactionHistory.get(0).getSenderAccountNumber()));

//    document.add(new Paragraph("Email: " + transactionHistory.get(0).getEmail(), detailFont));
//    document.add(new Paragraph("Mobile Number: " + transactionHistory.get(0).getMobileNumber(), detailFont));
            // Add a line break
            document.add(new Paragraph("\n"));

            Font font = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.RED);

            // Create a table with 5 columns
            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(100);

            // Add table headers
            table.addCell(new PdfPCell(new Paragraph("Transaction ID", font)));
            table.addCell(new PdfPCell(new Paragraph("Sender Account", font)));
            table.addCell(new PdfPCell(new Paragraph("Recipient Account", font)));
            table.addCell(new PdfPCell(new Paragraph("Amount", font)));
            table.addCell(new PdfPCell(new Paragraph("Timestamp", font)));

            // Add content to the table
            for (TransactionDTO transaction : transactionHistory) {
                table.addCell(new PdfPCell(new Paragraph(String.valueOf(transaction.getTransactionId()))));
                table.addCell(new PdfPCell(new Paragraph(transaction.getSenderAccountNumber())));
                table.addCell(new PdfPCell(new Paragraph(transaction.getRecipientAccountNumber())));
                table.addCell(new PdfPCell(new Paragraph(String.valueOf(transaction.getAmount()))));
                table.addCell(new PdfPCell(new Paragraph(transaction.getTimestamp())));
            }

            // Add the table to the document
            document.add(table);

            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

}
