package corejava.oopintro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PairTestCases {
    

    private Pair pair1;
    private Pair pair2;

    @Before
    public void setUp() throws Exception {
        pair1 = new Pair(1,2);
        pair2 = new Pair(1,2);
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testGetFirstElement() {
        assertEquals(1, pair1.getFirst());
    }
    
    @Test
    public void testGetSecondElement() {
        assertEquals(2, pair1.getSecond());
    }
    
    @Test
    public void testAreEqual() {
        assertTrue(pair1.equals(pair2));
    }

}
