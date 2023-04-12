
public class Trapping {
    public static int trapping(int heights[]) {
        // calculate the left max boundary
        int leftMax[] = new int[heights.length];
        leftMax[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
        }

        // calculate right max boundary array
        int rightMax[] = new int[heights.length];
        rightMax[heights.length - 1] = heights[heights.length - 1];
        for (int i = heights.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(heights[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < heights.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - heights[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int heights[] = { 4, 5, 6, 7, 8, 1, 0, 3, 5, 9 };
        System.out.println(trapping(heights));
    }
}
