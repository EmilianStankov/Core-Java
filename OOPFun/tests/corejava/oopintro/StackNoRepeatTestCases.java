package corejava.oopintro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackNoRepeatTestCases {

    private StackNoRepeat stack;

    @Before
    public void setUp() throws Exception {
        stack = new StackNoRepeat(1, 2, 3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCantAddElement() {
        stack.push(1);
        assertEquals(3, stack.length());
    }

}
