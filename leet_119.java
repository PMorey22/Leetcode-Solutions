import java.util.ArrayList;
import java.util.List;

public class leet_119 {
    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> row = getRow(rowIndex);
        System.out.println(row);
    }

    static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i <= rowIndex / 2; i++) {
            if (i == 0)
                row.add(1);
            else {
                row.add(rfunc(rowIndex, i) / cfunc(i));
            }
        }
        for (int i = (rowIndex / 2) + 1; i <= rowIndex; i++) {
            if (i == rowIndex)
                row.add(1);
                else{
            row.add(row.get(i / 2));}
        }
        return row;
    }

    static int rfunc(int a, int b) {
        int num = 1;
        for (int i = a; i > a - b; i--) {
            num = num * i;
        }
        return num;
    }

    static int cfunc(int a) {
        int num = 1;
        for (int i = 1; i <= a; i++) {
            num = num * i;
        }
        return num;
    }
}
