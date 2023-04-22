import java.util.HashMap;
import java.util.Map;

public class majority {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2,2,2,2};
        int size = arr.length;
        int majorityElement = findMajorityElement(arr, size);
        if (majorityElement != -1) {
            System.out.println("Majority element found: " + majorityElement);
        
        } else {
            System.out.println("No majority element found.");
        }
        
    }

    public static int findMajorityElement(int[] arr, int size) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            Integer count = countMap.get(num);
            if (count == null) {
                countMap.put(num, 1);
            } else {
                countMap.put(num, count + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > (size / 2)) {
                return entry.getKey();
            }
        }
        return -1;
    }
}