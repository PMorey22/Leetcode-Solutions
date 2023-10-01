public class leet_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int l = nums.length;
        int[] ans = new int[l];
        for (int i = 0; i < l; i++) {
            ans[index[i]] = nums[i];
        }
        return ans;
    }
}
