import java.util.Date;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {

    public static void main(String[] args) {
        // Hibernate setup
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // User input for insertion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Date of Birth (yyyy-MM-dd):");
        String dobString = scanner.nextLine();
        Date dateOfBirth = parseDate(dobString);

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        System.out.println("Enter Phone Number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        // Creating a new Person object with user input
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setDateOfBirth(dateOfBirth);
        person.setEmail(email);
        person.setPhoneNumber(phoneNumber);
        person.setAddress(address);

      

        // Hibernate transaction for data insertion
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();

        // Closing resources
        session.close();
        sessionFactory.close();
        scanner.close();
    }

    // Helper method to parse date string
    private static Date parseDate(String dateString) {
        try {
            return new Date(Long.parseLong(dateString));
        } catch (NumberFormatException e) {
            System.out.println("Invalid date format. Using the current date.");
            return new Date();
        }
    }
}
