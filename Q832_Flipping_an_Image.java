/**
 * Q832_Flipping_an_Image
 */
public class Q832_Flipping_an_Image {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 },
        };

        System.out.println(flipAndInvertImage(arr));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image[0].length][image.length];

        for (int i = 0; i < image.length; i++) {
            int res = 0;

            for (int j = image[i].length - 1; j >= 0; j--) {
                arr[i][res++] = image[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                } else if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }
}