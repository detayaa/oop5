
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {
    int weight;
    int cost;
    String name;

    String DOUBLE_PRODUCTS = "Нельзя добавить продукт второй раз";

    public Product(String name,int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
        this.name = name;
    }

    public void product() {
        System.out.println(name + ", вес - " + cost + ", цена - " + weight);
    }



}







