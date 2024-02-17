/**
 * Q35_Search_Insert_Position
 */
public class Q35_Search_Insert_Position {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 8 };
        int target = 7;
        System.out.println(searchInsert(arr, target));
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start - 1;
    }
}