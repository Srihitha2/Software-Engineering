import java.util.*;

public class SmartFridgeProgram {
    // Import pantry and recipes from another module
    static Map<String, Integer> pantry = SmartFridgeContents.pantry;
    static Map<String, Map<String, Integer>> recipes = SmartFridgeContents.recipes;

    static Map<String, Integer> shoppingList = new HashMap<>();

    // Function to add an item to the shopping list
    static void addShoppingItem(String item, int quantity) {
        shoppingList.put(item, shoppingList.getOrDefault(item, 0) + quantity);
    }
    public static void main(String[] args) {
        Map<String, String> displayDict = new HashMap<>();
        int index = 1;
        for (String recipe : recipes.keySet()) {
            displayDict.put(Integer.toString(index), recipe);
            index++;
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please choose your recipe from the options below");
            for (String key : displayDict.keySet()) {
                System.out.println(key + " : " + displayDict.get(key));
            }
            System.out.println("\nTo exit, please enter 0");

            String choice = scanner.nextLine();
            
            
            try {
                if(Integer.parseInt(choice) == 0) {
                    break;
                } else if (displayDict.containsKey(choice)) {

                String selectedRecipe = displayDict.get(choice);
                System.out.println("You chose the " + selectedRecipe + " recipe.");


                System.out.println("Here are the ingredients for your recipe:");
                Map<String, Integer> ingredients = recipes.get(selectedRecipe);

                for (String item : ingredients.keySet()) {
                    int reqQuantity = ingredients.get(item);
                    int quantityInPantry = pantry.getOrDefault(item, 0);

                    if (quantityInPantry < reqQuantity) {
                        int quantityToBuy = reqQuantity - quantityInPantry;
                        System.out.println("You need to buy " + quantityToBuy + " quantity of " + item + ".");
                        addShoppingItem(item, quantityToBuy);
                    } else {
                        System.out.println(item + " OK.");
                    }
                }
            } else {
                    System.out.println("Invalid choice. Please enter a valid choice from the options.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        System.out.println("\nShopping List:");
        if (shoppingList.isEmpty()) {
            System.out.println("No items to order!");
        } else {
            System.out.println("\nHere are the items we need to order:");
            for (String item : shoppingList.keySet()){
                int quantity = shoppingList.get(item);
                System.out.println(item + ": " + quantity);
            }
        }
    }
}
