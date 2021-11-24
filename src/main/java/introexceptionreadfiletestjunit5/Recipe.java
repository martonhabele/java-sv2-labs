package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public List<String> getRecipe(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot be read!", ioe);
        }
    }

    public void addIngredients(Path path) {
        List<String> recipe = getRecipe(path);
        for (int i = 2; i < recipe.size(); i++) {
            String[] item = recipe.get(i).split(" ");
            ingredients.add(item[2]);
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}