import java.util.ArrayList;
import java.util.List;

/**
 * Q1380_Luck_number_in_matrix
 */
public class Q1380_Luck_number_in_matrix {

    public static void main(String[] args) {
        int[][] arr = {
                { 3, 7, 8 },
                { 9, 11, 13 },
                { 15, 16, 17 },
        };

        System.out.println(luckyNumbers(arr));
    }

    static List<Integer> luckyNumbers(int[][] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (checkmatrix(arr, row, col)) {
                    list.add(arr[row][col]);
                }
            }
        }

        return list;
    }

    static boolean checkmatrix(int[][] arr, int row, int col) {
        int ele = arr[row][col];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] > ele && i != row) {
                return false;
            }
        }

        for (int i = 0; i < arr[row].length; i++) {
            if (arr[row][i] < ele && i != col) {
                return false;
            }
        }

        return true;
    }

}