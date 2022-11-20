import java.util.ArrayList;
import java.util.Objects;

public class Passport {
    private final int num;
    private final String lastName;
    private final String name;
    private final String middleName;
    private final String birth;

    public Passport(int num, String lastName, String name, String middleName, String birth) {
        this.num = num;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.birth = birth;
    }
    ArrayList<Object> nums = new ArrayList<>();

    public void first() {
        for (int i = 0; i < nums.size(); i++) {
            if ((nums.get(i)).equals (nums.get(i+1))) {
                nums.add(getName());
                nums.add(getLastName());
                nums.add(getMiddleName());
                nums.add(getBirth());
            }
        }
        System.out.println(nums);
    }

    public void printFirst() {
        System.out.println(nums);
    }



    public int getNum() {
        return num;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBirth() {
        return birth;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Passport passport = (Passport) o;
        return Objects.equals(num,passport.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
