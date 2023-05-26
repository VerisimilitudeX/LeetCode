import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allRows = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i);
            String num = String.valueOf((int) Math.pow(11, i));
            for (char c : num.toCharArray()) {
                row.add(Integer.parseInt(String.valueOf(c)));
            }
            allRows.add(row);
        }
        return allRows;
    }

    public static void main(String[] args) {
        System.out.println(PascalsTriangle.generate(5));
    }
}