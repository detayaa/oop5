import java.util.Objects;

public class Product {
    int weight;
    int cost;
    String name;
    private boolean check;


    public Product(String name, int weight, int cost) {
        if (weight == 0) {
            System.out.println("Вес неккоректен");
        } else {
            this.weight = weight;
        }
        if (cost == 0) {
            System.out.println("Цена неккоректна");
        } else {
            this.cost = cost;
        }
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Название не указано");
        } else {
            this.name = name;
        }
    }

    public void product() {
        System.out.println(name + ", вес - " + cost + ", цена - " + weight);
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(name,product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck() {
        this.check = check;
    }

    @Override
    public String toString() {
        String checkString = this.isCheck() ? "Yes" : "No";
        return String.format("%s, цена: %s, количество - %s, куплен: %s",
        this.name, this.cost, this.weight, checkString);

    }
}







