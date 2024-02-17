import java.util.Arrays;

/**
 * Q1920_Array_permutation
 */
public class Q1920_Array_permutation {

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        System.out.println(Arrays.toString(arr));
    }

    static int[] arrayPermutation(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr[i]];
        }

        return newArr;
    }

}