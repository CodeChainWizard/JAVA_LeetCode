import java.util.Arrays;

/**
 * Q135_Canday
 */
public class Q135_Canday {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2 };
        System.out.println(candy(arr));
    }

    static int candy(int[] arr) {
        int n = arr.length, candies[] = new int[n], ans = 0;

        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        while (--n >= 0) {
            ans += candies[n];
        }

        return ans;
    }
}