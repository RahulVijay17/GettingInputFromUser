import java.util.HashMap;
import java.util.Map;

public class DuplicateRepeatedCharacter {
    public static void main(String[] args) {
        String str = "Hello world";
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            Integer value = charCount.get(c);
            if (value == null) {
                charCount.put(c, 1);
            } else {
                charCount.put(c, value + 1);
            }
            System.out.println(charCount);
        }
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}