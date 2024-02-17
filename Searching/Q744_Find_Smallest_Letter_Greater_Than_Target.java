/**
 * Q744_Find_Smallest_Letter_Greater_Than_Target
 */
public class Q744_Find_Smallest_Letter_Greater_Than_Target {

    public static void main(String[] args) {
        char[] l = { 'x', 'x', 'y', 'y' };
        char target = 'z';

        System.out.println(nextSmallestChar(l, target));

    }

    static char nextSmallestChar(char[] l, char terget) {
        char ans = l[0];

        for (int i = 0; i < l.length; i++) {
            if (l[i] > terget) {
                ans = l[i];
                break;
            }
        }

        return ans;
    }
}