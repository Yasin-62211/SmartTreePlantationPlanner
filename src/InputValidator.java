import java.util.Scanner;

public class InputValidator {


    public static int getMenuChoice(Scanner input) {

        while (true) {

            System.out.print("Enter your choice: ");

            if (input.hasNextInt()) {

                int choice = input.nextInt();
                input.nextLine();

                if (choice >= 1 && choice <= 4) {
                    return choice;
                }

                System.out.println("Please select a number from 1 to 4.");

            } else {

                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();

            }
        }
    }

    public static double getPositiveNumber(Scanner input, String message) {

        while (true) {

            System.out.print(message);

            if (input.hasNextDouble()) {

                double number = input.nextDouble();
                input.nextLine();

                if (Double.isFinite(number) && number > 0) {
                    return number;
                }

                System.out.println("Please enter a positive number.");

            } else {

                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();

            }
        }
    }


}
