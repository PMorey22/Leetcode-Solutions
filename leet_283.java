public class leet_283 {
    public static void main(String[] args) {
        int[] nums = {0};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    static void moveZeroes(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] == 0) {
                shift(i, nums, l);
            }
        }
    }

    static void shift(int i, int[] nums, int l) {
        while (i < l - 1) {
            nums[i] = nums[i + 1];
            i++;
        }
        nums[l - 1] = 0;
    }
}
