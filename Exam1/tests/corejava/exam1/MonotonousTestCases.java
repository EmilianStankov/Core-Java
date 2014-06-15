package corejava.exam1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MonotonousTestCases {

    private MyUtil util;
    private List<Integer> list;
    private Vector<Integer> vector;
    private Stack<Integer> stack;

    @Before
    public void setUp() throws Exception {
        util = new MyUtil();
        list = new ArrayList<Integer>();
        vector = new Vector<Integer>();
        stack = new Stack<Integer>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testNotMonotonousArrayList() {
        list.add(-1);
        list.add(2);
        list.add(7);
        list.add(100);
        list.add(5);
        assertFalse(util.isMonotonous(list));
    }

    @Test
    public void testNotMonotonousVector() {
        vector.add(4);
        vector.add(3);
        vector.add(7);
        vector.add(889);
        vector.add(0);
        assertFalse(util.isMonotonous(vector));
    }

    @Test
    public void testNotMonotonousStack() {
        stack.add(3);
        stack.add(6);
        stack.add(7);
        stack.add(1);
        stack.add(-5);
        assertFalse(util.isMonotonous(stack));
    }

    @Test
    public void testMonotonousStack() {
        stack.add(3);
        stack.add(6);
        stack.add(7);
        stack.add(8);
        stack.add(9);
        assertTrue(util.isMonotonous(stack));
    }

    @Test
    public void testMonotonousVector() {
        vector.add(3);
        vector.add(2);
        vector.add(1);
        vector.add(0);
        vector.add(-1);
        assertTrue(util.isMonotonous(vector));
    }

    @Test
    public void testMonotonousArrayList() {
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        assertTrue(util.isMonotonous(list));
    }

}
