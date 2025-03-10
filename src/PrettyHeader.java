import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

        prettyHeader(message);

        scanner.close();
    }

    public static void prettyHeader(String msg) {
        final int WIDTH = 60;
        int messageLength = msg.length();
        int spaceOnEachSide = (WIDTH - messageLength - 6) / 2;

        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");
        for (int i = 0; i < spaceOnEachSide; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < spaceOnEachSide; i++) {
            System.out.print(" ");
        }
        if ((messageLength + 6) % 2 != 0) {
            System.out.print(" ");
        }
        System.out.println("***");

        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
