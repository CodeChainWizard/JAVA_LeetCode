import java.util.*;

/**
 * Q4_Median_of_Two_Sorted_Arrays
 */
public class Q4_Median_of_Two_Sorted_Arrays {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];

        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            newArr[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[index++] = arr2[i];
        }

        Arrays.sort(newArr);

        int total = newArr.length;

        if (total % 2 == 1) {
            return (double) newArr[total / 2];
        } else {
            int mid1 = newArr[total / 2 - 1];
            int mid2 = newArr[total / 2];

            return ((double) mid1 + (double) mid2) / 2.0;
        }

    }
}