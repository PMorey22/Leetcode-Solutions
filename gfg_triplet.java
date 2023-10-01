public class gfg_triplet {
    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        findTriplets(arr, 3);
    }

    static void findTriplets(int arr[], int n) {
        // add code here.
        int i = 0;
        int sum = 0;
        while (i < arr.length - 3) {
            if (sum == 0) {
                sum = arr[i] + arr[i + 1] + arr[i + 2];
            }
            if (sum != 0) {
                sum += arr[i + 2];
            }
            if (sum == 0) {
                // return true;
                System.out.println(1);
            } else {
                sum -= arr[i];
            }
        }
        // return false;
        System.out.println(0);

    }
}
