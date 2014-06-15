package corejava.exam1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyUtil {
    public List<Integer> sort(List<Integer> list) {
        List<Integer> newList = new ArrayList<Integer>();
        newList = list;
        Collections.sort(newList);

        return newList;
    }

    public List<Integer> reverse(List<Integer> list) {
        List<Integer> newList = new ArrayList<Integer>();
        newList = list;
        Collections.reverse(newList);

        return newList;
    }

    public boolean isMonotonous(List<Integer> list) {
        return list.equals(sort(new ArrayList<Integer>(list))) || list.equals(reverse(sort(new ArrayList<Integer>(list))));
    }
}
