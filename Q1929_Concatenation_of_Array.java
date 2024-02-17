import java.util.Arrays;

/**
 * Q1929_Concatenation_of_Array
 */
public class Q1929_Concatenation_of_Array {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        System.out.println(Arrays.toString(concatenationArray(arr)));
    }

    static int[] concatenationArray(int[] arr) {
        int[] newArr = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            newArr[i + arr.length] = arr[i];
        }

        return newArr;
    }
}