//using Binary search
public class searchElement {
    public static int searchElement(int arr[], int n, int k) {
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] > k) {
                h = mid - 1;
            }
            if (arr[mid] < k) {
                l = mid + 1;
            } else {
                return 1;

            }
        }

        return -1;
    }
}