import java.util.Scanner;

public class ValidationUtils {

    public static int getValidInt(Scanner sc, String message) {
        int value;
        while (true) {
            System.out.print(message);
            try {
                value = Integer.parseInt(sc.nextLine());
                return value;
            } catch (Exception e) {
                System.out.println("Invalid number! Try again.");
            }
        }
    }

    public static String getValidString(Scanner sc, String message) {
        String input;
        while (true) {
            System.out.print(message);
            input = sc.nextLine();
            if (!input.trim().isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be empty!");
        }
    }
}
