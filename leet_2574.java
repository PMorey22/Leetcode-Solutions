import java.sql.Array;
import java.util.Arrays;

public class leet_2574 {
    public static void main(String[] args) {
        int[] nums = { 10, 4, 8, 3 };
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }

    static int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i > 0)
                leftSum += nums[i - 1];
            if (i != nums.length)
                rightSum -= nums[i];
            ans[i] = Math.abs(leftSum - rightSum);
        }
        return ans;

    }
}
