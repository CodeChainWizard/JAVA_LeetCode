/**
 * Q1351_Count_Negative_Numbers_in_a_Sorted_Matrix
 */
public class Q1351_Count_Negative_Numbers_in_a_Sorted_Matrix {

    public static void main(String[] args) {
        int[][] grid = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 },
        };
        System.out.println(countNegatives(grid));
    }

    static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}