import java.util.ArrayList;
import java.util.Arrays;

public class leet_1313 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    static int[] decompressRLElist(int[] nums) {
        int freq, val, s = 0;
        for (int i = 0; i < nums.length; i += 2) {
            s += nums[i];
        }
        int[] ans = new int[s];
        int p = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            freq = nums[2 * i];
            val = nums[2 * i + 1];
            while (freq != 0) {
                ans[p] = val;
                p++;
                freq--;
            }
        }
        return ans;

    }
}
