import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks obtained: ");
        int marks = scanner.nextInt();

        char grade = calculateGrade(marks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static char calculateGrade(int marks) {
        if (marks >= 85) {
            return 'A';
        } else if (marks >= 60) {
            return 'B';
        } else if (marks >= 40) {
            return 'C';
        } else {
            return 'F';
        }
    }
}