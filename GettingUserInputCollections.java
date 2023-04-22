import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class GettingUserInputCollections {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for a list of integers
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            list.add(element);
        }
        System.out.println("List: " + list);

        // Get user input for a map of strings and integers
        HashMap<String, Integer> map = new HashMap<>();
        System.out.print("Enter the size of the map: ");
        size = scanner.nextInt();
        System.out.println("Enter the key-value pairs of the map:");
        for (int i = 0; i < size; i++) {
            String key = scanner.next();
            int value = scanner.nextInt();
            map.put(key, value);
        }
        System.out.println("Map: " + map);

        // Get user input for a set of strings
        HashSet<String> set = new HashSet<>();
        System.out.print("Enter the size of the set: ");
        size = scanner.nextInt();
        System.out.println("Enter the elements of the set:");
        for (int i = 0; i < size; i++) {
            String element = scanner.next();
            set.add(element);
        }
        System.out.println("Set: " + set);
    }
}