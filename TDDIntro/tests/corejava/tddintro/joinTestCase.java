package corejava.tddintro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class joinTestCase {
    private join join;
    @Before
    public void setUp() throws Exception {
        this.join = new join();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testWithIntegers() {
        Integer[] a = new Integer[]{1, 2, 3, 4};
        
        assertEquals("1 2 3 4", join.join(" " , a));
    }
    
    @Test
    public void testWithStrings() {
        String[] a = new String[]{"baba", "dqdo", "vnuk"};
        
        assertEquals("baba, dqdo, vnuk", join.join(", " , a));
    }
    
    @Test
    public void testWithDoubles() {
        Double[] a = new Double[]{0.12, 4.13, 3.14};
        
        assertEquals("0.12 / 4.13 / 3.14", join.join(" / " , a));
    }

}
