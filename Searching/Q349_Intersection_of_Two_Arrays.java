import java.util.Arrays;
import java.util.HashSet;

/**
 * Q349_Intersection_of_Two_Arrays
 */
public class Q349_Intersection_of_Two_Arrays {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2 };

        System.err.println(Arrays.toString(intersection(arr1, arr2)));
    }

    static int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : arr1) {
            set1.add(i);
        }

        for (int i : arr2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }

        int[] res = new int[set2.size()];
        int index = 0;
        for (int n : set2) {
            res[index++] = n;
        }

        return res;
    }
}