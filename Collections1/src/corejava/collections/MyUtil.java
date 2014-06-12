package corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyUtil {
    public String hashMapToString(HashMap<? extends Object, ? extends Object> hash) {
        String result = "{ ";
        for (Object item : hash.keySet()) {
            result += item.toString() + ": " + hash.get(item) + ", ";
        }
        result = result.substring(0, result.length() - 2);
        result += " }";
        return result;
    }

    public Map<String, Integer> countWords(String text) {
        Map result = new LinkedHashMap<String, Integer>();
        List<String> words = Arrays.asList(text.split(" "));
        for (String word : words) {
            if (!result.containsKey(word)) {
                result.put(word, 1);
            } else {
                result.put(word, (Integer) result.get(word) + 1);
            }
        }
        return result;
    }

    public Set duplicating(Set... sets) {
        boolean inAllSets = false;
        Set duplicating = new HashSet();
        for (Set s : sets) {
            for (Object o : s) {
                for (Set s2 : sets) {
                    if (s2.contains(o)) {
                        inAllSets = true;
                    } else {
                        inAllSets = false;
                        break;
                    }
                }
                if (inAllSets) {
                    duplicating.add(o);
                }
            }
        }
        return duplicating;
    }
}
