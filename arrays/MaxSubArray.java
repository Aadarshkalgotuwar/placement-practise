public class MaxSubArray {
    public static void SubArray(int numbers[]) {
        int Currsum = 0;
        int MaxSum = Integer.MIN_VALUE;

        // code for subarray //
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    Currsum += numbers[k];
                }
                System.out.println(Currsum);
                if (MaxSum < Currsum) {
                    MaxSum = Currsum;
                }
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        SubArray(numbers);

    }
}