import java.util.Arrays;

/**
 * Q1_Tow_Sum
 */
public class Q1_Tow_Sum {

    public static void main(String[] args) {
        int target = 6;
        int[] arr = { 3, 2, 3 };
        System.out.println(Arrays.toString(towSum(arr, target)));
    }

    static int[] towSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}