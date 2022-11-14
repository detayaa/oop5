import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ProductList<T extends Product> {
    Set<Product> list = new HashSet<>();

    public void addList() {
        if (list.add()) {
        }
    }

    }

