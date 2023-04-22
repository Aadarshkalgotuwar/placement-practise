import java.util.*;

public class StoreWater {
    public static int Storedwater(ArrayList<Integer> height) {// O(n)
        // using 2 pointer approach
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            // calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            // update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(2);
        height.add(5);
        height.add(6);
        height.add(9);
        height.add(5);
        height.add(3);
        height.add(5);

        System.out.println(Storedwater(height));
    }
}