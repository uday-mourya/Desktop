import java.util.Scanner;

class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0 || number > 999) {
            System.out.println("Number out of range (0-999)");
            return;
        }

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        String result = "";

        if (hundreds != 0) {
            switch (hundreds) {
                case 1:
                    result += "One Hundred ";
                    break;
                case 2:
                    result += "Two Hundred ";
                    break;
                case 3:
                    result += "Three Hundred ";
                    break;
                // add more cases up to 9 if needed
            }
        }

        if (tens != 0 || ones != 0) {
            if (tens == 1) {
                switch (ones) {
                    case 0:
                        result += "Ten";
                        break;
                    case 1:
                        result += "Eleven";
                        break;
                    case 2:
                        result += "Twelve";
                        break;
                    // add more cases for teens up to nineteen if needed
                }
            } else {
                switch (tens) {
                    case 2:
                        result += "Twenty ";
                        break;
                    case 3:
                        result += "Thirty ";
                        break;
                    // add more cases for tens up to ninety if needed
                }

                switch (ones) {
                    case 1:
                        result += "One";
                        break;
                    case 2:
                        result += "Two";
                        break;
                    // add more cases for ones up to nine if needed
                }
            }
        }

        System.out.println(result);
    }
}