/**
 * Q81_Search_in_Rotated_Sorted_Array_II
 */
public class Q81_Search_in_Rotated_Sorted_Array_II {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 3;
        System.out.println(search(arr, target));
    }

    static boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            }

            if (arr[start] == arr[mid]) {
                start++;
                continue;
            } else if (arr[mid] <= arr[end]) {
                if (target >= arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target >= arr[start] && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }
}