package corejava.exam1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyUtil {
    public static List<Integer> sort(List<Integer> list) {
        List<Integer> newList = new ArrayList<Integer>(list);
        Collections.sort(newList);
        return newList;
    }

    public static List<Integer> reverse(List<Integer> list) {
        List<Integer> newList = new ArrayList<Integer>(list);
        Collections.reverse(newList);
        return newList;
    }

    public static boolean isMonotonous(List<Integer> list) {
        return list.equals(sort(list)) || list.equals(reverse(sort(list)));
    }
}
