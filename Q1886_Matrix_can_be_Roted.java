/**
 * Q1886_Matrix_can_be_Roted
 */
public class Q1886_Matrix_can_be_Roted {

    public static void main(String[] args) {
        int[][] mat = {
                { 0, 1 },
                { 1, 0 },
        };

        int[][] target = {
                { 1, 0 },
                { 0, 1 },
        };

        System.out.println(findRotation(mat, target));
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        int c_90 = 0, c_180 = 0, c_270 = 0, c_0 = 0, n = mat.length;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < target.length; j++) {
                if (target[i][j] == mat[n - j - 1][i]) {
                    c_90++;
                }
                if (target[i][j] == mat[n - i - 1][n - j - 1]) {
                    c_180++;
                }

                if (target[i][j] == mat[j][n - i - 1]) {
                    c_270++;
                }
                if (target[i][j] == mat[i][j]) {
                    c_0++;
                }
            }
        }
        if (c_0 == n * n || c_90 == n * n || c_180 == n * n || c_270 == n * n) {
            return true;
        } else {
            return false;
        }
    }
}