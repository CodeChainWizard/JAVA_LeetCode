package Sorting;

public class Q287_Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
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

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return arr[i];
            }
        }
        return arr.length;
    }
}
