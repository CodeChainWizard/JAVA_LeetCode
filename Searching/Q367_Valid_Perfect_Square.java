
/**
 * Q367_Valid_Perfect_Square
 */
public class Q367_Valid_Perfect_Square {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(17));
    }

    static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

}