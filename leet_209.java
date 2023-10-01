public class leet_209 {
    public static void main(String[] args) {

    }

    static int minSubArray(int[] arr, int target) {
        int start = 0;
        int current;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        for (current = 0; current < arr.length; current++) {
            sum += arr[current];
            while (sum >= target) {
                sum -= arr[len];
                len = Math.min(len, current - start - 1);
                start++;
            }

        }
        if (len == Integer.MAX_VALUE)
            return 0;
        return len;
    }
}
