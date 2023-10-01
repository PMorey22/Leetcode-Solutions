import java.util.Arrays;

public class leet_1365 {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int l = nums.length;
        int[] ans = new int[l];
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            int c = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            ans[i] = count;
        }

        System.out.println(Arrays.toString(ans));

    }
}
