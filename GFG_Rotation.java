public class GFG_Rotation {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 2, 3 };
        System.out.println(rotation(arr));
    }

    static int rotation(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (arr[start] <= arr[end]) {
            return start;
        }

        int mid = start + (end - start) / 2;
        int next = (mid + 1) % arr.length;
        int prev = (mid + arr.length - 1) % arr.length;

        if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
            return mid;
        }

        if (arr[mid] >= arr[start]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }

        return 0;
    }
}
