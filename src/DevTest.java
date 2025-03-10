import java.util.Scanner;

public class DevTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = getRegExString(scanner, "Enter a valid SSN:", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered: " + result);

        scanner.close();
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        while (true) {
            System.out.print(prompt + " ");
            input = pipe.nextLine();
            if (input.matches(regEx)) {
                return input;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
