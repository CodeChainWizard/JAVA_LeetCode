import java.util.Arrays;

/**
 * Q34_Find_First_an_Last_Position_of_Element_in_Sorted_Array
 */
public class Q34_Find_First_an_Last_Position_of_Element_in_Sorted_Array {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };

        ans[0] = check(arr, target, true);
        ans[1] = check(arr, target, false);

        return ans;
    }

    static int check(int[] arr, int target, boolean firstIndex) {
        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (firstIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}