/**
 * Q1295_Find_even_digit_numbers
 */
public class Q1295_Find_even_digit_numbers {

    public static void main(String[] args) {
        int[] arr = { 112, 1212 };
        System.out.println(findNumber(arr));
    }

    static int findNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int count1 = 0;

            while (arr[i] > 0) {
                count1++;
                arr[i] = arr[i] / 10;
            }

            if (count1 % 2 == 0) {
                count++;
            }

        }
        return count;
    }
}