public class Search {
    public static int rsearch(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            // Return sentinel value -1 to indicate target not found
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return rsearch(arr, tar, si, mid - 1);
            } else {
                return rsearch(arr, tar, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return rsearch(arr, tar, mid + 1, ei);
            } else {
                return rsearch(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 7, 4, 1 };
        int target = 7;
        int tarIdx = rsearch(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
