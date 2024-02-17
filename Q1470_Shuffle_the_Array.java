import java.util.Arrays;

/**
 * Q1470_Shuffle_the_Array
 */
public class Q1470_Shuffle_the_Array {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    static int[] shuffle(int[] arr, int n) {
        int[] newArr = new int[arr.length];

        int left = 0;
        int right = n;

        int i = 0;

        while (right < arr.length) {
            newArr[i] = arr[left];
            newArr[i + 1] = arr[right];

            left++;
            right++;
            i = i + 2;
        }

        return newArr;
    }
}