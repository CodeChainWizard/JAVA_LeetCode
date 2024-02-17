import java.util.Arrays;

/**
 * Q167_Two_Sum_II_Input_Array_Is_Sorted
 */
public class Q167_Two_Sum_II_Input_Array_Is_Sorted {

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        System.out.println(Arrays.toString(towSum(arr, target)));
    }

    static int[] towSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (arr[left] + arr[right] != target) {
            if (arr[left] + arr[right] < target)
                left++;
            else
                right--;
        }
        return new int[] { left + 1, right + 1 };
    }

}