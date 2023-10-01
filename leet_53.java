public class leet_53{
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int i=0;
        while(i<nums.length){
            sum+=nums[i];
            max=Integer.max(max, sum);
            if(sum<0){
                sum=0;
            }
            
            i++;
        }
        return max;
    }
}