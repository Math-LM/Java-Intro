import java.util.Scanner;
import java.time.LocalDate;

public class Students {

    public static void main(String[] args) {

        final String RESET = "\033[0m";
        final String MAGENTA = "\033[35m";
        final String BOLD = "\033[1m";
        final String ITALIC = "\033[3m";

        Scanner scanner = new Scanner(System.in);

        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        int currentMonth = today.getMonthValue();
        int currentDay = today.getDayOfMonth();

        System.out.print("How many students do you want to register? ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        String studentsList = "";

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("\n>>> Student " + i + " <<<");

            System.out.print("Enter first name: ");
            String name = scanner.nextLine();
            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter birth day: ");
            int birthDay = scanner.nextInt();
            System.out.print("Enter birth month: ");
            int birthMonth = scanner.nextInt();
            System.out.print("Enter birth year: ");
            int birthYear = scanner.nextInt();
            while (birthYear > currentYear) {
                System.out.print("Invalid year. Enter birth year: ");
                birthYear = scanner.nextInt();
            }
            scanner.nextLine();
            System.out.print("Enter the registered course: ");
            String course = scanner.nextLine();
            
            //Check if birthday already passed this year
            boolean birthdayPassed = (birthMonth < currentMonth) || ((birthMonth == currentMonth) && (birthDay <= currentDay));

            int age;
            if (birthdayPassed) {
                age = currentYear - birthYear;
            } else {
                age = currentYear - birthYear - 1;
            }

            String birthMonthText;
            //Get month text
            switch(birthMonth) {
                case 1:
                    birthMonthText = "January";
                    break;
                case 2:
                    birthMonthText = "February";
                    break;
                case 3:
                    birthMonthText = "March";
                    break;
                case 4:
                    birthMonthText = "April";
                    break;
                case 5:
                    birthMonthText = "May";
                    break;
                case 6:
                    birthMonthText = "June";
                    break;
                case 7:
                    birthMonthText = "July";
                    break;
                case 8:
                    birthMonthText = "August";
                    break;
                case 9:
                    birthMonthText = "September";
                    break;
                case 10:
                    birthMonthText = "October";
                    break;
                case 11:
                    birthMonthText = "November";
                    break;
                case 12:
                    birthMonthText = "December";
                    break;
                default:
                    birthMonthText = "";
            }

            studentsList += BOLD + name + " " + lastName + RESET + ", ";
            studentsList += ((birthDay <= 9) ? "0" : "") + birthDay + " " + birthMonthText + " " + birthYear + ", ";
            studentsList += ITALIC + course + RESET + "\n";
        }

        System.out.println("\nList of registered students:");
        System.out.println(studentsList);
        scanner.close();
    }
}