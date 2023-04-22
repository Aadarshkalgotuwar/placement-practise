import java.lang.reflect.Array;
import java.util.*;

public class MainList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            list1.add(i * 3);
        }
        mainlist.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            list2.add(i * 5);
        }
        mainlist.add(list2);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currList = mainlist.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }
}