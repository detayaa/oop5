import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    public String name;

    private Map<Product, Integer> products = new HashMap<>();
    public int count;


    public Recipe(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Название не указано");
        } else {
            this.name = name;
        }
    }

    public void addProduct(Product product, int count) {
        if (count <= 0) {
            count = 1;
        }
        if (this.products.containsKey(product)) {
            this.products.put(product, this.products.get(product) + count);
        } else {
            this.products.put(product,count);
        }
    }

    public float allSumma() {
        float sum = 0;
        for (Map.Entry<Product, Integer> product: this.products.entrySet()) {
            sum += product.getKey().getCost() * product.getValue();
        }
        return sum;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(name,recipe.name);
    }
    public int hashCode() {
        return Objects.hash(name);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

