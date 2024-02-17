/**
 * Q1608_Special_Array_With_X_Elements_Greater_Than_or_Equal_X
 */
public class Q1608_Special_Array_With_X_Elements_Greater_Than_or_Equal_X {

    public static void main(String[] args) {
        int[] arr = { 0, 4, 3, 0, 4 };
        System.out.println(specialArray(arr));
    }

    public static int specialArray(int[] nums) {

        int start = 0;
        int end = nums.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int curr = count(nums, mid);

            if (curr == mid) {
                return mid;
            } else if (curr < mid) {
                end = mid - 1;
            } else if (curr > mid) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int count(int[] arr, int t) {
        int c = 0;
        for (int i : arr) {
            if (i >= t) {
                c++;
            }
        }
        return c;
    }
}