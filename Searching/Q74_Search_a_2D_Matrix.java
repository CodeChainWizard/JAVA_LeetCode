/**
 * Q74_Search_a_2D_Matrix
 */
public class Q74_Search_a_2D_Matrix {

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 },
        };

        int target = 31;

        System.out.println(searchMatrix(arr, target));
    }

    static boolean searchMatrix(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

}