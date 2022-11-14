import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product banana = new Product("Бананы",2, 5);
        Product apple = new Product("Яблоки",5, 13);
        Product lime = new Product("Лайм",3, 7);

        Set<Product> list = new HashSet<>();
        list.add(banana);
        list.add(lime);
        list.add(banana);
        list.add(apple);




    }
}
