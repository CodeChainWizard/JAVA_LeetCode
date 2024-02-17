/**
 * Q1011_Capacity_To_Ship_Packages_Within_D_Days
 */
public class Q1011_Capacity_To_Ship_Packages_Within_D_Days {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int day = 5;
        System.out.println(shipWithinDays(arr, day));
    }

    static int shipWithinDays(int[] weight, int days) {
        int sum = 0;
        int max = 0;

        for (int i = 0; i < weight.length; i++) {
            sum += weight[i];
            max = Math.max(max, weight[i]);
        }

        if (weight.length == days) {
            return max;
        }

        int low = max;
        int hight = sum;
        int ans = 0;

        while (low <= hight) {
            int mid = low + (hight - low) / 2;
            if (isPossibale(weight, mid, days) == true) {
                ans = mid;
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    static boolean isPossibale(int[] weight, int mid, int day) {
        int d = 1;
        int sum = 0;

        for (int i = 0; i < weight.length; i++) {
            sum += weight[i];
            if (sum > mid) {
                d++;
                sum = weight[i];
            }
        }

        return d <= day;
    }
}