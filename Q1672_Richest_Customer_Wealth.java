/**
 * Q1672_Richest_Customer_Wealth
 */
public class Q1672_Richest_Customer_Wealth {

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };

        System.out.println(richPerson(arr));
    }

    static int richPerson(int[][] arr) {
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            int money = 0;
            for (int col = 0; col < arr[row].length; col++) {
                money += arr[row][col];
            }
            sum = Math.max(sum, money);
        }

        return sum;
    }
}