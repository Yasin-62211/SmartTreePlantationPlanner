import java.util.ArrayList;

public class TreePlanner {


    ArrayList<Tree> trees = new ArrayList<>();

    // Constructor: Add tree information to the database
    public TreePlanner() {

        trees.add(new Tree("Mango", "Loamy", "High", 20, 35));
        trees.add(new Tree("Neem", "Sandy", "Low", 20, 40));
        trees.add(new Tree("Jackfruit", "Loamy", "High", 20, 35));
        trees.add(new Tree("Coconut", "Sandy", "High", 25, 35));
        trees.add(new Tree("Rain Tree", "Loamy", "High", 18, 35));

    }

    // Recommend the top 3 trees based on environmental conditions
    public void recommendTrees(String soilType, String rainfall,
                               double temperature) {

        ArrayList<String> recommendedTrees = new ArrayList<>();
        ArrayList<Integer> matchingScores = new ArrayList<>();

        // Calculate the matching score for each tree
        for (Tree tree : trees) {

            int score = 0;

            // Check soil type
            if (tree.soilType.equalsIgnoreCase(soilType)) {
                score += 40;
            }

            // Check rainfall level
            if (tree.rainfallLevel.equalsIgnoreCase(rainfall)) {
                score += 30;
            }

            // Check temperature range
            if (temperature >= tree.minTemperature
                    && temperature <= tree.maxTemperature) {
                score += 30;
            }

            // Store trees with at least one matching condition
            if (score > 0) {
                recommendedTrees.add(tree.name);
                matchingScores.add(score);
            }
        }

        // Sort trees by matching score in descending order
        for (int i = 0; i < matchingScores.size(); i++) {

            for (int j = i + 1; j < matchingScores.size(); j++) {

                if (matchingScores.get(j) > matchingScores.get(i)) {

                    int tempScore = matchingScores.get(i);
                    matchingScores.set(i, matchingScores.get(j));
                    matchingScores.set(j, tempScore);

                    String tempName = recommendedTrees.get(i);
                    recommendedTrees.set(i, recommendedTrees.get(j));
                    recommendedTrees.set(j, tempName);
                }
            }
        }

        // Display the top 3 recommendations
        System.out.println("\n========== TOP TREE RECOMMENDATIONS ==========");

        if (recommendedTrees.isEmpty()) {

            System.out.println("No matching trees found in the database.");
            System.out.println("Please try different environmental conditions.");

        } else {

            int limit = Math.min(3, recommendedTrees.size());

            for (int i = 0; i < limit; i++) {

                System.out.println("\n" + (i + 1) + ". "
                        + recommendedTrees.get(i));

                System.out.println("   Matching Score: "
                        + matchingScores.get(i) + "%");

                System.out.println("----------------------------------------------");
            }
        }

        System.out.println("==============================================");
    }

    // Display information about all available trees
    public void displayAllTrees() {

        System.out.println("\n========== AVAILABLE TREES ==========");

        for (Tree tree : trees) {

            System.out.println("\nTree Name: " + tree.name);
            System.out.println("Soil Type: " + tree.soilType);
            System.out.println("Rainfall Level: " + tree.rainfallLevel);

            System.out.println("Temperature Range: "
                    + tree.minTemperature + " - "
                    + tree.maxTemperature + " C");

            System.out.println("--------------------------------------");
        }
    }


}
