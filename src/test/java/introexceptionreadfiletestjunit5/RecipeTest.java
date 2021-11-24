package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {
    public Recipe recipe = new Recipe();

    @Test
    void testAddIngredients() {
        Path path = Paths.get("src/main/java/introexceptionreadfiletestjunit5/resources/recipe.txt");
        recipe.addIngredients(path);
        assertEquals("margarin", recipe.getIngredients().get(1));
        assertEquals(10, recipe.getIngredients().size());
    }

    @Test
    void testAddIngredientsWithoutValidFile() {
        Path path = Paths.get("");

        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> recipe.addIngredients(path));
        assertEquals("File cannot be read!", ise.getMessage());
    }
}