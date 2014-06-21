package corejava.exam1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortTestCases {
    
    private List<Integer> a;
    private List<Integer> result;

    @Before
    public void setUp() throws Exception {
        result = new ArrayList<Integer>();
        result.add(-1);
        result.add(2);
        result.add(5);
        result.add(7);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testArrayListSort() {
        a = new ArrayList<Integer>();
        a.add(5);
        a.add(7);
        a.add(2);
        a.add(-1);
        assertEquals(result, MyUtil.sort(a));
    }

    @Test
    public void testVectorSort() {
        a = new Vector<Integer>();
        a.add(5);
        a.add(7);
        a.add(2);
        a.add(-1);
        assertEquals(result, MyUtil.sort(a));
    }

    @Test
    public void testStackSort() {
        a = new Stack<Integer>();
        a.add(5);
        a.add(7);
        a.add(2);
        a.add(-1);
        assertEquals(result, MyUtil.sort(a));
    }
}
