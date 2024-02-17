
/**
 * Q1539_Kth_Missing_Positive_Number
 */
public class Q1539_Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int k = 2;
        System.out.println(findKthPositive(arr, k));
    }

    static int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (i <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }
}