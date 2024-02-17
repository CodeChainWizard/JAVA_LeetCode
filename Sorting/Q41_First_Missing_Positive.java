package Sorting;

/**
 * Q41_First_Missing_Positive
 */
public class Q41_First_Missing_Positive {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0 };
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int corrent = arr[i] - 1;

            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[corrent]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }

        return arr.length + 1;
    }
}