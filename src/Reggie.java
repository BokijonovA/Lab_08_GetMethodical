import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reggie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a SSN (XXX-XX-XXXX): ");
        String ssn = getRegExString(scanner, "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN: " + ssn);

        System.out.println("Enter a UC Student M number (M#####): ");
        String mNumber = getRegExString(scanner, "^(M|m)\\d{5}$");
        System.out.println("Your UC Student M number: " + mNumber);

        System.out.println("Enter a menu choice (O, S, V, Q): ");
        String menuChoice = getRegExString(scanner, "^[OoSsVvQq]$");
        System.out.println("Your menu choice: " + menuChoice);

        scanner.close();
    }

    public static String getRegExString(Scanner scanner, String regex) {
        String input;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        while (true) {
            input = scanner.nextLine();
            matcher = pattern.matcher(input);

            if (matcher.matches()) {
                break;
            } else {
                System.out.println("Invalid input. Please try again: ");
            }
        }
        return input;
    }
}
