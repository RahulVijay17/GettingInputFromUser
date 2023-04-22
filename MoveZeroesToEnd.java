import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12,99,3};
        int count = 0; // counter for non-zero elements

        // iterate through array and move non-zero elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // fill the rest of the array with zeroes
        while (count < arr.length) {
            arr[count++] = 0;
        }

        // print the modified array
        System.out.println(Arrays.toString(arr));
    }
}
