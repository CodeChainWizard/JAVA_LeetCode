import java.util.Arrays;

/**
 * Q66_Pluse_One
 */
public class Q66_Pluse_One {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(Arrays.toString(pluseOne(arr)));
    }

    static int[] pluseOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
        }

        int[] new_arr = new int[arr.length];
        new_arr[0] = 1;
        return new_arr;

    }
}