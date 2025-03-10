import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        String moreItems;

        do {
            double price = SafeInput.getDouble(in, "Enter item price");
            total += price;

            System.out.print("Do you want to enter another item? (Y/N): ");
            moreItems = in.nextLine().trim().toLowerCase();
        } while (moreItems.equals("y"));

        System.out.printf("Total price: $%.2f\n", total);
    }
}
