import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = getRangedInt(scanner, "Enter your birth year (1950-2015): ", 1950, 2015);
        int month = getRangedInt(scanner, "Enter your birth month (1-12): ", 1, 12);

        int day = getValidDay(scanner, month, year);

        int hour = getRangedInt(scanner, "Enter your birth hour (1-24): ", 1, 24);
        int minute = getRangedInt(scanner, "Enter your birth minute (1-59): ", 1, 59);

        System.out.println("You were born on: " + year + "-" + month + "-" + day + " " + hour + ":" + minute);

        scanner.close();
    }

    public static int getRangedInt(Scanner scanner, String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextInt();
            if (value >= min && value <= max) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a value between " + min + " and " + max + ".");
            }
        }
        return value;
    }

    public static int getValidDay(Scanner scanner, int month, int year) {
        int day = 0;
        int maxDays = 31;

        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    maxDays = 29;
                } else {
                    maxDays = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDays = 31;
                break;
        }

        while (true) {
            day = getRangedInt(scanner, "Enter the day of your birth (1-" + maxDays + "): ", 1, maxDays);
            break;
        }

        return day;
    }
}
