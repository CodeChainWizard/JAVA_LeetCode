import java.util.Arrays;

/**
 * Q888_Fair_Candy_Swap
 */
public class Q888_Fair_Candy_Swap {

    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        int[] arr2 = { 2, 2 };
        System.out.println(Arrays.toString(fairCandy(arr, arr2)));
    }

    static int[] fairCandy(int[] aliceSizes, int[] bobSizes) {
        int a = 0;
        int b = 0;

        for (int i : aliceSizes) {
            a += i;
        }

        for (int i : bobSizes) {
            b += i;
        }

        int m = aliceSizes.length, n = bobSizes.length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((a - aliceSizes[i] + bobSizes[j]) == (b - bobSizes[j] + aliceSizes[i])) {
                    return new int[] { aliceSizes[i], bobSizes[j] };
                }
            }
        }

        return new int[0];
    }
}