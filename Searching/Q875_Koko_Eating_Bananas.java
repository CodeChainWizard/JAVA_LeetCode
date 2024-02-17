/**
 * Q875_Koko_Eating_Bananas
 */
public class Q875_Koko_Eating_Bananas {

    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(arr, h));
    }

    static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1000000000;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (box(mid, piles, h))
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }

    static boolean box(int k, int[] piles, int h) {
        int hours = 0;
        for (int pile : piles) {
            int div = pile / k;
            hours += div;
            if (pile % k != 0)
                hours++;
        }
        return hours <= h;
    }
}