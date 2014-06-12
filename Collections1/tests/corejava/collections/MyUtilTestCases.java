package corejava.collections;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyUtilTestCases {
    private MyUtil util;
    private LinkedHashMap<Object, Object> map;

    @Before
    public void setUp() throws Exception {
        util = new MyUtil();
        map = new LinkedHashMap();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testStringInteger() {
        map.put("Wut?", 42);
        map.put("Batman", 100);
        map.put("K", 0);
        assertEquals("{ Wut?: 42, Batman: 100, K: 0 }", util.hashMapToString(map));
    }

    @Test
    public void testStringCharacter() {
        map.put("Wut?", 'a');
        map.put("Batman", 'b');
        map.put("K", 'c');
        assertEquals("{ Wut?: a, Batman: b, K: c }", util.hashMapToString(map));
    }

    @Test
    public void testDoubleCharacter() {
        map.put(1.22, 'a');
        map.put(3.14, 'b');
        map.put(10.64, 'c');
        assertEquals("{ 1.22: a, 3.14: b, 10.64: c }", util.hashMapToString(map));
    }

    @Test
    public void testCountWords() {
        String text = "Ninjas are all over the place! We are all going to die!";
        Map<String, Integer> textMap = util.countWords(text);
        assertEquals("{ Ninjas: 1, are: 2, all: 2, over: 1, the: 1, place!: 1, We: 1, going: 1, to: 1, die!: 1 }",
                util.hashMapToString((HashMap<? extends Object, ? extends Object>) textMap));
    }
    
    @Test
    public void testDuplicating(){
        Set a = new HashSet();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        Set b = new HashSet();
        b.add(4);
        b.add(5);
        b.add(6);
        Set c = new HashSet();
        c.add(5);
        c.add(6);
        Set result = new HashSet();
        result.add(5);
        assertEquals(result, util.duplicating(a, b, c));
    }
}
