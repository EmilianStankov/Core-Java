package corejava.collections;

import java.util.Collection;
import java.util.Iterator;

public class ReverseCollection {
    static void reverse(Collection<Integer> collection) {
        Integer[] integers = new Integer[collection.size()] ;
        int i = 0;
        for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
            Integer integer = (Integer) iterator.next();
            integers[i] = integer;
            iterator.remove();
            i++;
        }
        for (int j = integers.length - 1; j >= 0; j--){
            collection.add(integers[j]);
        }
    }
}
