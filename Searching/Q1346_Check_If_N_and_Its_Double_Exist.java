/**
 * Q1346_Check_If_N_and_Its_Double_Exist
 */
public class Q1346_Check_If_N_and_Its_Double_Exist {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 11 };
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] * 2 && i != j) {
                    return true;
                }
            }
        }

        return false;
    }
}