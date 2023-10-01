public class gfg_spiral_matrix {
    public static void main(String[] args) {
        int n = 4, m = 4;
        int[][] A = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        findK(A, m, n);
    }

    static void findK(int A[][], int m, int n) {
        int c;
        int t = 0, d = n - 1, l = 0, r = m - 1;
        int dir = 0;

        while (t <= d && l <= r) {
            dir = 0;
            if (dir == 0) {
                for (int i = l; i <= r; i++) {
                    System.out.println(A[t][i]);
                }
                t++;
                dir += 1;
            }
            if (dir == 1) {
                for (int i = t; i <= d; i++) {
                    System.out.println(A[i][r]);
                }
                r--;
                dir += 1;
            }
            if (dir == 2) {
                for (int i = r; i >= l; i--) {
                    System.out.println(A[d][i]);
                }
                d--;
                dir += 1;
            }
            if (dir == 3) {
                for (int i = d; i >= t; i--) {
                    System.out.println(A[i][l]);
                }
                l++;
                dir += 1;
            }

        }

    }

    {
        // Your code here

    }

}
