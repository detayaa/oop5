import java.util.Objects;
import java.util.Set;

public class Recipe {

    public String name;

    private Set<Product> products;


    public Recipe( Set<Product> products, String name, int summa) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Название не указано");
        } else {
            this.name = name;
        }

        this.products = products;
    }

    public float allSumma() {
        float sum = 0;
        for (Product product : products) {
            sum += product.getCost();
        }
        return sum;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
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
}
