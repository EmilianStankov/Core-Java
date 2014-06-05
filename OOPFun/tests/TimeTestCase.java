import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import corejava.oopintro.Time;


public class TimeTestCase {

    private Time time;

    @Before
    public void setUp() throws Exception {
        this.time = new Time();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println(time.toString());
        System.out.println(time.now());
    }

}
