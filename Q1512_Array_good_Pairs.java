/**
 * Q1512_Array_good_Pairs
 */
public class Q1512_Array_good_Pairs {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 3 };
        System.out.println(goodPair(arr));
    }

    static int goodPair(int[] arr) {
        int[] newArr = new int[101];
        int res = 0;

        for (int i : arr) {
            res += newArr[i]++;
        }

        return res;
    }
}