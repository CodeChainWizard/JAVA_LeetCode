/**
 * Q.1732_Find_the_Highest_Altitude
 */
public class Q1732_Find_the_Highest_Altitude {

    public static void main(String[] args) {
        int[] arr = { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {
        int n = gain.length;
        int max = 0;
        int max_final = 0;

        for (int i = 0; i < n; i++) {
            max += gain[i];
            max_final = Math.max(max_final, max);
        }
        return max_final;
    }
}