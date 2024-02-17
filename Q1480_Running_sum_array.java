import java.util.Arrays;

/**
 * Q1480_Running_sum_array
 */
public class Q1480_Running_sum_array {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] arr) {
        int[] newArr = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            newArr[i] = sum;
        }

        return newArr;
    }
}