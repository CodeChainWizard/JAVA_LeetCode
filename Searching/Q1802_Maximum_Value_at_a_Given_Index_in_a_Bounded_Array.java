/**
 * Q1802_Maximum_Value_at_a_Given_Index_in_a_Bounded_Array
 */
public class Q1802_Maximum_Value_at_a_Given_Index_in_a_Bounded_Array {

    public static void main(String[] args) {
        System.out.println(maxValue(4, 2, 6));
    }

    public static int maxValue(int n, int index, int maxSum) {
        maxSum -= n;
        int left = 0, right = maxSum;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (isPossible(mid, index, n, maxSum)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left + 1;
    }

    public static boolean isPossible(int a, int index, int n, int sum) {
        long left = Math.max(a - index, 0);
        long result = (a + left) * (a - left + 1) / 2;
        long right = Math.max(a - ((n - 1) - index), 0);
        result += (a + right) * (a - right + 1) / 2;
        return (result - a <= sum);
    }
}