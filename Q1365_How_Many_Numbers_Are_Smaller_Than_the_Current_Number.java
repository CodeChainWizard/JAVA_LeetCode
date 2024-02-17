import java.util.Arrays;

/**
 * Q1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number
 */
public class Q1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(smallerNumber(arr)));
    }

    static int[] smallerNumber(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < res.length; j++) {
                if (arr[j] < arr[i] && j != i) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}