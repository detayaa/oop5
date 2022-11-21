import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {

    String phone;

    public HashMap<String, String> map = new HashMap<String, String>();


    public void addPhoneBook(String fullName, String phone) {
        map.put(fullName,phone);
    }

    public Set<Map.Entry<String, String>> getEntries() {
        return map.entrySet();
    }
}
