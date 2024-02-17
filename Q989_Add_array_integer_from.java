import java.util.LinkedList;
import java.util.List;

/**
 * Q989_Add_array_integer_from
 */
public class Q989_Add_array_integer_from {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0 };
        int k = 34;
        System.out.println(addToArrayForm(arr, k));
    }

    static List<Integer> addToArrayForm(int[] arr, int k) {
        List<Integer> list = new LinkedList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            list.add(0, (arr[i] + k) % 10);
            k = (arr[i] + k) / 10;
        }
        while (k > 0) {
            list.add(0, k % 10);
            k /= 10;
        }

        return list;
    }
}