import java.util.*;

public class ProductList {
    private static final Set<Product> products = new HashSet<>();


    public static void addProduct(Product product) {
        if (product == null) {
            return;
        }
        if (products.contains(product)) {
            throw new IllegalArgumentException();
        } else {
            products.add(product);
        }
    }

    public void checkProducts(String name) {
        for (Product product : this.products) {
            if (product.getName().equals(name)) {
                product.setCheck();
                break;
            }
        }
    }

    public void removeProduct(String name) {
        Iterator<Product> productIterator = this.products.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getName().equals(name)) {
                productIterator.remove();
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов").append("\n");
        for (Product product : this.products) {
            stringBuilder.append(product).append("\n");
        }
        return stringBuilder.toString();
    }
}

