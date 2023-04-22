import java.util.HashMap;
import java.util.Map;

public class Majority2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 2, 2 ,2};

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
                countMap.put(num,countMap.getOrDefault(num, 0)+1);
        }

        int majorityElement = -1;
        for (int num : countMap.keySet()) {
            if (countMap.get(num) >= (arr.length + 1) / 2) {
                majorityElement = num;
                break;
            }
        }

        if (majorityElement != -1) {
            System.out.println("Majority element found: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }
}