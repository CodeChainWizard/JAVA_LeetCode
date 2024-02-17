/**
 * Q169_Majority_Element
 */
public class Q169_Majority_Element {

    public static void main(String[] args) {
        int[] arr = { 3, 3, 4 };
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] arr) {
        int ele = arr[0];
        int count = 0;

        for (int val : arr) {
            if (count == 0) {
                ele = val;
            }
            if (ele == val) {
                count++;
            } else {
                count--;
            }
        }

        return ele;
    }

}