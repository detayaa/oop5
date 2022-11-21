import java.util.HashMap;

public class Keys {
    HashMap<String,Integer> map = new HashMap<>();


    public void addMap(String key, int value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        } else {
            int valueFromMap = map.get(key);
            if (valueFromMap == value) {
                throw new IllegalArgumentException("Такой ключ уже есть");
            } else{
                map.put(key, valueFromMap + value);
            }

        }
        }
}
