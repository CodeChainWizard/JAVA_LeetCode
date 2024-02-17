package Sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Q442_Find_All_Duplicates_in_an_Array
 */
public class Q442_Find_All_Duplicates_in_an_Array {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length;) {
            int check_index = arr[i] - 1;
            if (arr[i] != arr[check_index]) {
                int temp = arr[i];
                arr[i] = arr[check_index];
                arr[check_index] = temp;
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }
}