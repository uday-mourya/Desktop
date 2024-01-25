import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.Scanner;

public class InsertFacultyData {

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

        System.out.println("Enter Department:");
        String department = scanner.nextLine();

        System.out.println("Enter Position:");
        String position = scanner.nextLine();

        System.out.println("Enter Joining Date (yyyy-MM-dd):");
        String joiningDateString = scanner.nextLine();
        Date joiningDate = parseDate(joiningDateString);

        System.out.println("Enter Salary:");
        double salary = scanner.nextDouble();

        // Creating a new Faculty object with user input
        Faculty faculty = new Faculty();
        faculty.setFirstName(firstName);
        faculty.setLastName(lastName);
        faculty.setDepartment(department);
        faculty.setPosition(position);
        faculty.setJoiningDate(joiningDate);
        faculty.setSalary(salary);

        // Hibernate transaction for data insertion
        Transaction transaction = session.beginTransaction();
        session.save(faculty);
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
