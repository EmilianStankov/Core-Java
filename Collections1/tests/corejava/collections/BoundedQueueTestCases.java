package corejava.collections;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoundedQueueTestCases {

    private BoundedQueue boundedQueue;

    @Before
    public void setUp() throws Exception {
        boundedQueue = new BoundedQueue<Integer>(3);
        boundedQueue.offer(1);
        boundedQueue.offer(2);
        boundedQueue.offer(3);
        boundedQueue.offer(4);
        boundedQueue.offer(5);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        assertEquals("3, 4, 5", boundedQueue.toString());
    }

}
