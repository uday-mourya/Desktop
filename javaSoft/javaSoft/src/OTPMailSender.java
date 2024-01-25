import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

public class OTPMailSender {

    public static void main(String[] args) {
        String toEmail = "bahia7813@gmail.com"; // Replace with the recipient's email address

        // Generate OTP
        String otp = generateOTP();

        // Send OTP via email
        sendOTPEmail(toEmail, otp);
    }

    private static String generateOTP() {
        Random random = new Random();
        int otpLength = 6; // You can change the length of the OTP as needed
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < otpLength; i++) {
            otp.append(random.nextInt(10));
        }

        return otp.toString();
    }

    private static void sendOTPEmail(String toEmail, String otp) {
        final String fromEmail = "bhartiaman665@gmail.com"; // Replace with your email address
        final String password = "Aman@665"; // Replace with your email password

        // Setup mail server properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create a session with an authenticator
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Create a default MimeMessage object
            Message message = new MimeMessage(session);

            // Set From: header field of the header
            message.setFrom(new InternetAddress(fromEmail));

            // Set To: header field of the header
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));

            // Set Subject: header field
            message.setSubject("Your OTP");

            // Now set the actual message
            message.setText("Your OTP is: " + otp);

            // Send message
            Transport.send(message);

            System.out.println("Sent OTP successfully to " + toEmail);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
