import java.util.HashSet;
import java.util.Scanner;

public class TwoSum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int sum = scanner.nextInt();

        findPairs(array, sum);
    }

    public static void findPairs(int[] array, int sum) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            int complement = sum - array[i];
            if (set.contains(complement)) {
                System.out.println(array[i] + " " + complement);
            }
            set.add(array[i]);
        }
    }
}




