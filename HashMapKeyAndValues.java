import java.util.HashMap;
import java.util.Map;

public class HashMapKeyAndValues {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(null, "value1");
        map.put("key2", null);
        map.put(null, null);

       // System.out.println(map.get(null)); // Output: null
       // System.out.println(map.get("key2")); // Output: null
       // System.out.println(map.get("key3")); // Output: null
        System.out.println(map);
    }
}
