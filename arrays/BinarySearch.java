public class BinarySearch {
    public static int binary(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparisons
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 5, 7, 44, 3, 2, 7, 8 };
        int key = 44;

        System.out.println(binary(numbers, key));
    }
}