import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    HashMap<String, Integer> recipes = new HashMap<>();

    public void addRecipe(Recipe recipe) {
        if (recipes.containsKey(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        } else {
            recipes.put(recipe.name, recipe.count);
        }
    }
}
