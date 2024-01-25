
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InsertMobileDataWithInput {

    public static void main(String[] args) {
        // Hibernate setup
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // User input for insertion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Mobile ID:");
        int mobileId = scanner.nextInt();

        scanner.nextLine(); // Consume the newline

        System.out.println("Enter Mobile Brand:");
        String brand = scanner.nextLine();

        System.out.println("Enter Mobile Model:");
        String model = scanner.nextLine();

        System.out.println("Enter Mobile Storage Capacity:");
        int storageCapacity = scanner.nextInt();

        scanner.nextLine(); // Consume the newline

        System.out.println("Enter Mobile Color:");
        String color = scanner.nextLine();

        System.out.println("Enter Mobile Price:");
        double price = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline

//        System.out.println("Enter Mobile Release Date (YYYY-MM-DD):");
//        String releaseDateStr = scanner.nextLine();
//
//        // Parsing the release date
//        Date releaseDate = null;
//        try {
//            releaseDate = new SimpleDateFormat("yyyy-MM-dd").parse(releaseDateStr);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            System.out.println("Invalid date format. Exiting program.");
//            System.exit(1);
//        }

        // Creating a new Mobile object with user input
        Mobile mobile = new Mobile();
        mobile.setMobileId(mobileId);
        mobile.setBrand(brand);
        mobile.setModel(model);
        mobile.setStorageCapacity(storageCapacity);
        mobile.setColor(color);
        mobile.setPrice(price);
        
        
        
//        mobile.setReleaseDate(releaseDate);

        // Hibernate transaction for data insertion
        Transaction transaction = session.beginTransaction();
        session.save(mobile);
        transaction.commit();

        // Closing resources
        session.close();
        sessionFactory.close();
        scanner.close();
    }
}

