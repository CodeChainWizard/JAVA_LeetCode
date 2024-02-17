import java.util.Arrays;

/**
 * Q1901_Find_a_Peak_Element_II
 */
public class Q1901_Find_a_Peak_Element_II {

    public static void main(String[] args) {
        int[][] arr = {
                { 48, 36, 35, 17, 48 },
                { 38, 28, 38, 26, 24 },
                { 15, 9, 33, 32, 6 },
                { 49, 4, 8, 10, 41 },
        };
        System.out.println(Arrays.toString(findPeakGrid(arr)));
    }

    static int findMax(int arr[][], int mid) {
        int max = 0;
        int row = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][mid] > max) {
                max = arr[i][mid];
                row = i;
            }
        }

        return row;
    }

    static int[] findPeakGrid(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            int row = findMax(arr, mid);

            int left = -1;
            int right = -1;

            if (mid - 1 >= 0) {
                left = arr[row][mid - 1];
            }

            if (mid + 1 < m) {
                right = arr[row][mid + 1];
            }

            if (arr[row][mid] > left && arr[row][mid] > right) {
                return new int[] { row, mid };
            } else if (arr[row][mid] > left) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

}