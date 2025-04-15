import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to read input from keyboard

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine(); // Reads the first name

        System.out.println("Enter your Middle Name (press ENTER if none)");
        String middleName = scanner.nextLine(); // reads middle name if none skips it

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine(); // Reads the last name

        System.out.println("Enter suffix (press ENTER if none)");
        String suffix = scanner.nextLine();

        String fullName;

        if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName;
        } else {
            fullName = firstName + " " + middleName + " " + lastName;
        }

        if (suffix. isEmpty()){
            fullName = firstName + middleName + "," + " " + lastName;
        } else {
            fullName = firstName + middleName + "," + lastName + " " + suffix;
        }
        System.out.println("Hello, " + fullName + "!"); // Full greetings of name

    }
}