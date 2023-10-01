import java.util.ArrayList;
import java.util.List;

public class leet_118 {
    public static void main(String[] args) {
        int numRows = 3;
        System.out.println(generate(numRows));
    }
    // static List<List<Integer>> generate(int numRows) {
    // List<List<Integer>> ans=new ArrayList<List<Integer>>();
    // for(int i=0;i<numRows;i++){
    // List<Integer> row=new ArrayList<Integer>();
    // for(int j=0;j<=i;j++){
    // if(j==0 || j==i){
    // row.add(1);
    // }
    // else{
    // // System.out.println(row.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j)));
    // row.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
    // }
    // }
    // ans.add(row);
    // }
    // return ans;
    // }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    row.add(1);
                else {
                    row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }
}

// import java.util.ArrayList;
// import java.util.List;

// public class leet_118 {
// public static void main(String[] args) {
// int numRows = 3;
// System.out.println(generate(numRows));
// }

// static List<List<Integer>> generate(int numRows) {
// List<List<Integer>> ans = new ArrayList<List<Integer>>();
// for (int i = 0; i < numRows; i++) {
// List<Integer> row = new ArrayList<Integer>();
// for (int j = 0; j <= i; j++) {
// if (j == 0 || j == i) {
// row.add(1);
// } else {
// List<Integer> prevRow = ans.get(i - 1);
// int left = prevRow.get(j - 1);
// int right = prevRow.get(j);
// row.add(left + right);
// }
// }
// ans.add(row);
// }
// return ans;
// }
// }
