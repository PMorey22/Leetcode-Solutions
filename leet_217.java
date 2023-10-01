import java.util.Arrays;


public class leet_217{
    public static void main(String[] args) {
        int[] nums={1,1};
        System.out.println(duplicate(nums));

    }

    static boolean duplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int c=nums[i];
            for(int j=i+1;nums[j]<nums[i]+1;j++){
                if(nums[j]==c){
                    return true;
                }
            }
        }
        return false;
    }
}