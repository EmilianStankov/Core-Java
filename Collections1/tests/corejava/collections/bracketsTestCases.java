package corejava.collections;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class bracketsTestCases {

    private Brackets brackets;

    @Before
    public void setUp() throws Exception {
        brackets = new Brackets();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testNotProperlyClosed() {
        assertEquals(false, brackets.verifyBrackets("((())"));
    }

    @Test
    public void testNotProperlyClosedSameNumberLeftAndRight() {
        assertEquals(false, brackets.verifyBrackets("())(()"));
    }

    @Test
    public void testAreClosed() {
        assertEquals(true, brackets.verifyBrackets("()()"));
    }

    @Test
    public void testOubviouslyNotClosed() {
        assertEquals(false, brackets.verifyBrackets(")("));
    }

}
