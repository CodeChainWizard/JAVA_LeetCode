/**
 * Q53_Find_MAx_Sum_SubArray
 */
public class Q53_Find_MAx_Sum_SubArray {

    public static void main(String[] args) {
        int[] arr = { 1 };
        System.out.println(maSum(arr));
    }

    static int maSum(int[] arr) {
        int maxSum = arr[0];
        int currSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}