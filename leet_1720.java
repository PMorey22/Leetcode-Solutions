import java.util.Arrays;

public class leet_1720 {
    public static void main(String[] args) {
        int[] encoded = { 1, 2, 3 };
        int first = 1;
        System.out.println(Arrays.toString(decode(encoded, first)));
    }

    static int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length + 1];
        ans[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            ans[i + 1] = ans[i] ^ encoded[i];
        }
        return ans;
    }
}
