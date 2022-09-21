
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {

    public static ArrayList<Recipe> getRecipesListFromFile(String fileName) {
        ArrayList<String> lines = new ArrayList();
        ArrayList<ArrayList<String>> recipesElementsList = new ArrayList();

        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                String nextLine = reader.nextLine();

                if (nextLine.isEmpty()) {
                    recipesElementsList.add(new ArrayList<>(lines));
                    lines.clear();
                    continue;
                }
                lines.add(nextLine);
            }

            if (!lines.isEmpty()) {
                recipesElementsList.add(new ArrayList<>(lines));
            }

            
            ArrayList<Recipe> recipes = new ArrayList();
            for (ArrayList<String> list : recipesElementsList) {
                String name = list.get(0);
                int cookingTime = Integer.valueOf(list.get(1));
                List<String> ingredients = list.subList(2, list.size());
                Recipe newRecipe = new Recipe(name, cookingTime, new ArrayList(ingredients));
                recipes.add(newRecipe);
            }

            return recipes;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static void printRecipes(ArrayList<Recipe> recipesList) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipesList) {
            System.out.println(recipe);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read:");
        String fileName = scanner.nextLine();

        ArrayList<Recipe> recipes = getRecipesListFromFile(fileName);

        if (recipes == null) {
            System.out.println("There was a problem reading file " + fileName + ".  The program will now exit.");
            return;
        }

        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind ingredient - searches recipes by ingredient");

        while (true) {

            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                printRecipes(recipes);
            }

            if (command.equals("find name")) {
                System.out.println("Searched word:");
                String searchedWord = scanner.nextLine();

                ArrayList<Recipe> recipesToReturn = new ArrayList();
                for (Recipe recipe : recipes) {
                    if (!(recipe.getName().contains(searchedWord))) {
                        continue;
                    }

                    recipesToReturn.add(recipe);
                }

                printRecipes(recipesToReturn);
            }

            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());

                ArrayList<Recipe> recipesToReturn = new ArrayList();
                for (Recipe recipe : recipes) {
                    if (!(recipe.getCookingTime() <= maxCookingTime)) {
                        continue;
                    }

                    recipesToReturn.add(recipe);
                }

                printRecipes(recipesToReturn);
            }

            if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                ArrayList<Recipe> recipesToReturn = new ArrayList();
                for (Recipe recipe : recipes) {
                    System.out.println(recipe.getIngredients());
                    boolean recipeIncludesTheIngredient = recipe.getIngredients().contains(ingredient);
                    if (!recipeIncludesTheIngredient) continue;

                    recipesToReturn.add(recipe);
                }
                printRecipes(recipesToReturn);
            }

        }

    }

}
