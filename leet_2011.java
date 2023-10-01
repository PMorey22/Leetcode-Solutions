public class leet_2011 {
    public static void main(String[] args) {
        String[] operations = { "--X", "X++", "X++" };
        int ans = finalValueAfterOperations(operations);
        System.out.println(ans);
    }

    static int finalValueAfterOperations(String[] operations) {
        int i = 0;
        for (int j = 0; j < operations.length; j++) {
            if (operations[j] == "++X" || operations[j] == "X++") {
                i++;

            } else {
                i--;
            }
        }
        return i;
    }
    // public int finalValueAfterOperations(String[] operations) {
    // int x = 0;
    // for(String s : operations)
    // if(s.charAt(1) == '-') x--;
    // else x++;
    // return x;
    // }
}
