import java.util.Arrays;

/**
 * Q1304_sum_N_unique_number_sum
 */
public class Q1304_sum_N_unique_number_sum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }

    static int[] sumZero(int n) {
        int[] new_arr = new int[n];

        if (n % 2 != 0) {
            new_arr[0] = 0;
        }

        for (int i = 0; i < n - 1; i++) {
            new_arr[i] = i + 1;
            new_arr[++i] = -i;
        }

        return new_arr;
    }
}
