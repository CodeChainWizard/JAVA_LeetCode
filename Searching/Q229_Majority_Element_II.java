import java.util.ArrayList;
import java.util.List;

/**
 * Q229_Majority_Element_II
 */
public class Q229_Majority_Element_II {

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        System.out.println(majorityElement(arr));
    }

    static List<Integer> majorityElement(int[] arr) {
        int c1 = 0, c2 = 0, count1 = 0, count2 = 0;

        for (int num : arr) {
            if (c1 == num) {
                count1++;
            } else if (c1 == num) {
                count2++;
            } else if (count1 == 0) {
                c1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                c2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = count2 = 0;
        for (int num : arr) {
            if (num == c1) {
                count1++;
            } else if (num == c2) {
                count2++;
            }
        }

        List<Integer> list = new ArrayList<>();
        if (count1 > arr.length / 3) {
            list.add(c1);
        }
        if (count2 > arr.length / 3) {
            list.add(c2);
        }

        return list;
    }
}