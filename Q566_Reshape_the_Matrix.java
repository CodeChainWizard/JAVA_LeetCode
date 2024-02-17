import java.util.Arrays;

/**
 * Q566_Reshape_the_Matrix
 */
public class Q566_Reshape_the_Matrix {

    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;
        System.out.println(Arrays.toString(matrixReshape(mat, r, c)));
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (r * c != m * n) {
            return mat;
        }

        int[][] new_mat = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            new_mat[i / c][i % c] = mat[i / n][i % n];
        }
        return new_mat;
    }
}