import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import corejava.oopintro.Time;


public class TimeTestCase {

    private Time time;
    private Time time2;

    @Before
    public void setUp() throws Exception {
        this.time = new Time();
        this.time2 = new Time(20, 13);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println(time.toString());
        System.out.println(time2.toString());
        System.out.println(time2.now());
    }

}
