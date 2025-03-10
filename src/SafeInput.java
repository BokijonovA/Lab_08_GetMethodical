import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner in, String prompt) {
        String input;
        do {
            System.out.print(prompt + ": ");
            input = in.nextLine().trim();
        } while (input.isEmpty());
        return input;
    }

    public static int getInt(Scanner in, String prompt) {
        int num;
        while (true) {
            System.out.print(prompt + ": ");
            if (in.hasNextInt()) {
                num = in.nextInt();
                in.nextLine(); // Consume the newline
                return num;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                in.nextLine(); // Clear invalid input
            }
        }
    }

    public static double getDouble(Scanner in, String prompt) {
        double num;
        while (true) {
            System.out.print(prompt + ": ");
            if (in.hasNextDouble()) {
                num = in.nextDouble();
                in.nextLine(); // Consume the newline
                return num;
            } else {
                System.out.println("Invalid input. Please enter a decimal number.");
                in.nextLine(); // Clear invalid input
            }
        }
    }
}
