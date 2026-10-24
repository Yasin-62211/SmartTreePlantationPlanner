import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TreePlanner planner = new TreePlanner();

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println("     SMART TREE PLANTATION PLANNER");
            System.out.println("========================================");

            System.out.println("1. Get Tree Recommendation");
            System.out.println("2. View Available Trees");
            System.out.println("3. Calculate Plantation Capacity");
            System.out.println("4. Exit");

            choice = InputValidator.getMenuChoice(input);

            switch (choice) {

                case 1:

                    System.out.print("Enter soil type (Loamy/Sandy/Clay): ");
                    String soilType = input.nextLine();

                    System.out.print("Enter rainfall level (Low/Medium/High): ");
                    String rainfall = input.nextLine();

                    System.out.print("Enter average temperature in Celsius: ");
                    double temperature = input.nextDouble();
                    input.nextLine();

                    planner.recommendTrees(soilType, rainfall, temperature);

                    break;

                case 2:

                    planner.displayAllTrees();

                    break;

                case 3:

                    double landArea = InputValidator.getPositiveNumber(
                            input, "Enter land area in decimal: "
                    );

                    if (landArea <= 0) {

                        System.out.println("Please enter a positive land area.");

                    } else {

                        double areaInSquareMeters = landArea * 40.47;
                        int numberOfTrees = (int) (areaInSquareMeters / 16);

                        System.out.println("\n========== PLANTATION ESTIMATE ==========");
                        System.out.println("Land Area: " + landArea + " decimal");
                        System.out.printf("Area: %.2f square meters%n", areaInSquareMeters);
                        System.out.println("Estimated Number of Trees: " + numberOfTrees);

                    }

                    break;

                case 4:

                    System.out.println("Thank you for using Smart Tree Plantation Planner!");

                    break;

                default:

                    System.out.println("Invalid choice. Please select 1 to 4.");

            }

        } while (choice != 4);

        input.close();

    }

}
