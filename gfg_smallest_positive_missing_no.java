import java.lang.reflect.Array;
import java.util.Arrays;

public class gfg_smallest_positive_missing_no {
    public static void main(String[] args) {
        int[] arr = { 0 };
        int size = 1;
        System.out.println(missingNumber(arr, size));

    }

    static int missingNumber(int arr[], int size) {
        // Your code here
        Arrays.sort(arr);
        // int c=0;
        for (int i = 0; i < size; i++) {
            if (arr[i] >= 0) {
                // c=arr[i];
                while (i < size - 1) {
                    if (arr[i] + 1 == arr[i + 1]) {
                        i++;
                    } else
                        return arr[i] + 1;
                }
                return size + 1;
            } else
                continue;

        }
        return 0;
    }
}
