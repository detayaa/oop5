import java.lang.reflect.Array;
import java.util.*;

import static javax.swing.UIManager.get;

public class Main {
    public static void main(String[] args) {

        Product banana = new Product("Бананы", 2, 5);
        banana.product();
        Product apple = new Product("Яблоки", 5, 13);
        apple.product();
        Product lime = new Product("Лайм", 3, 7);
        lime.product();
        Product milk = new Product("Молоко", 1, 1);
        milk.product();
        Product eggs = new Product("Яйца", 2, 4);
        eggs.product();
        Product sugar = new Product("Сахар", 10, 6);
        sugar.product();

        ProductList productList = new ProductList();

        ProductList.addProduct(apple);
        ProductList.addProduct(lime);
        ProductList.addProduct(banana);
        System.out.println(productList);

        numbersRemove();


        List<Pair> allPairs = new ArrayList<>();
        for (int first = 1; first <= 10; first++)
        {
            for (int second = first; second <= 10; second++)
            {
                allPairs.add(new Pair(first, second));
            }
        }
        Collections.shuffle(allPairs);
        List<Pair> chosenPairs = allPairs.subList(0, 15);

        System.out.println(chosenPairs);

        Passport semen = new Passport(1234568, "Semenov", "Semen", "Semenovich", "12.01.2000");
        Passport andrey = new Passport(1234568, "Andreev", "Andrey", "Anreevich", "12.01.2000");

        ArrayList<Object> nums = new ArrayList<>();
        nums.add(semen.getNum());
        nums.add(andrey.getNum());
        andrey.first();
        System.out.println(nums);


    }

    private static void numbersRemove(){
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        //System.out.println(numbers);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()){
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }

        }
        System.out.println(numbers);

    }

}



