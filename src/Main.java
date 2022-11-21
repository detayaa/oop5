import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

import static javax.swing.UIManager.get;

public class Main {
    public static void main(String[] args) {

        Product banana = new Product("Бананы", 2, 5,2);
        banana.product();
        Product apple = new Product("Яблоки", 5, 13,3);
        apple.product();
        Product lime = new Product("Лайм", 3, 7,1);
        lime.product();
        Product milk = new Product("Молоко", 1, 1,4);
        milk.product();
        Product eggs = new Product("Яйца", 2, 4,10);
        eggs.product();
        Product sugar = new Product("Сахар", 10, 6,13);
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

        Phonebook phonebook = new Phonebook();

        phonebook.addPhoneBook("Semen Semenov", "+79139229781");
        phonebook.addPhoneBook("Artur Arturov", "+79139223781");
        phonebook.addPhoneBook("Andrey Andreev", "+79139229881");
        phonebook.addPhoneBook("Karl Karlov", "+79139269781");
        phonebook.addPhoneBook("Ivan Ivanov", "+79239229781");
        phonebook.addPhoneBook("Ilya Ilyshin", "+79112229781");
        phonebook.addPhoneBook("Roman Romanov", "+79109829781");
        phonebook.addPhoneBook("Anatoliy Sidorov", "+79123229781");
        phonebook.addPhoneBook("Daniil Qwerty", "+79139278781");
        phonebook.addPhoneBook("Danil Ytrewq", "+79139229790");
        phonebook.addPhoneBook("Roma Safronov", "+79139229721");
        phonebook.addPhoneBook("Tanya Smirnova", "+79139229745");
        phonebook.addPhoneBook("Semen Byrkov", "+79139229767");
        phonebook.addPhoneBook("Nastya Bobyleva", "+79139229737");
        phonebook.addPhoneBook("Semen Pod", "+79139229776");
        phonebook.addPhoneBook("Gosha Ryblev", "+79139229703");
        phonebook.addPhoneBook("Olga Opernaya", "+79139229723");
        phonebook.addPhoneBook("Andrey Tymenev", "+79139229783");
        phonebook.addPhoneBook("Valeriia Lodochkina", "+79139229787");
        phonebook.addPhoneBook("Oxana Noname", "+79139229785");

        for (Map.Entry<String, String> entry: phonebook.getEntries()){
            System.out.println(entry.getValue());
        }


        Map<Integer,String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(1, "hi");
        orderedMap.put(2, "ha");
        orderedMap.put(3, "ih");
        orderedMap.put(4, "ho");
        orderedMap.put(7, "hy");
        orderedMap.put(6, "hr");
        orderedMap.put(9, "hq");
        orderedMap.put(8, "hw");
        orderedMap.put(5, "he");
        orderedMap.put(10, "hp");

        for (Map.Entry<Integer,String> entry:  orderedMap.entrySet()) {
            System.out.printf("%d:%s%n", entry.getKey(), entry.getValue());
        }

    }

    private static void numbersRemove(){
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }

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



