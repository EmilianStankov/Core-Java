package corejava.oopintro;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackImplTestCases {

    private StackImpl stack;
    private StackImpl stack2;

    @Before
    public void setUp() throws Exception {
        stack = new StackImpl();
        stack2 = new StackImpl(1, 2, 3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetLength() {
        assertEquals(0, stack.length());
        assertEquals(3, stack2.length());
    }

    @Test
    public void testPush() {
        stack.push(2);
        assertEquals(1, stack.length());
    }

    @Test
    public void testPop() {
        stack2.pop();
        assertEquals(2, stack2.length());
    }
    
    @Test
    public void testClear() {
        stack2.clear();
        assertEquals(0, stack2.length());
    }
    
    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        assertTrue(!stack2.isEmpty());
    }
}
