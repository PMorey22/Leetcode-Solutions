// import java.util.Arrays;

import java.util.Arrays;

public class leet_169 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    static int majorityElement(int[] nums) {
        if(nums.length==1) return 1;
        Arrays.sort(nums);
        int c = 1, m = 0, i = 0, j = 1;
        while (i < nums.length - 1 && j < nums.length) {
            if (nums[i] == nums[j]) {
                c++;
                j++;
            } else {
                if (c > m) {
                    m = c; // Update m with the maximum count
                }
                c = 1; // Reset the count
                i = j;
                j++;
            }
        }
        
        // Check one last time in case the majority element is the last element
        if (c > m) {
            m = c;
        }
        
        return m > nums.length / 2 ? nums[i] : -1; // Return the majority element if it exists, otherwise -1
    }
}
