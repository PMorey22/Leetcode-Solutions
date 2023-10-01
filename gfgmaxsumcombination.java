import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class gfgmaxsumcombination {
    public static void main(String[] args) {
        int N = 4,        K = 3;
        int[] A= {1, 4, 2, 3},B= {2, 5, 1, 6};
        System.out.println(maxCombinations(N, K, A, B));

    }

    public static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        Arrays.sort(A);
        Arrays.sort(B);
        int i = A.length - 1, j = B.length - 1;
        List<Integer> ans = new ArrayList<>();

        while (N > 0 && K > 0) {
            ans.add(A[i] + B[j]);
            N--;
            K--;

            if (j > 0 && (i == 0 || A[i] + B[j - 1] > A[i - 1] + B[j])) {
                j--;
            } else {
                i--;
            }
        }

        return ans;
    }

    
}
