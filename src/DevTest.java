import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = SafeInput.getNonZeroLenString(in, "What is your name");
        System.out.println("Your name is: " + name);

        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("Your age is: " + age);

        double amount = SafeInput.getDouble(in, "How much money is in your bank account?");
        System.out.println("The amount in your bank is: $" + amount);

        int score = SafeInput.getRangedInt(in, "Enter your test score", 0, 100);
        System.out.println("Your test score is: " + score);

        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double within the range", 1.0, 10.0);
        System.out.println("You entered: " + rangedDouble);

        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to play again?");
        System.out.println("Your choice: " + (confirm ? "True" : "False"));

        String regExString = SafeInput.getRegExString(in, "Enter your SSN number (ex. 123-456-7890): ", "^\\d{3}-\\d{3}-\\d{4}$");
        System.out.println("Your SSN number is: " +regExString);


    }
}