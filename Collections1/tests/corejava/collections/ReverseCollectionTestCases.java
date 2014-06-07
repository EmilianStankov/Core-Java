package corejava.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseCollectionTestCases {
    
    private ReverseCollection collection;
    private ArrayList<Integer> col;
    private ArrayList<Integer> reverseCol;

    @Before
    public void setUp() throws Exception {
        collection = new ReverseCollection();
        col = new ArrayList();
        col.add(1);
        col.add(2);
        col.add(3);
        reverseCol = new ArrayList();
        reverseCol.add(3);
        reverseCol.add(2);
        reverseCol.add(1);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testReverseStack() {
       collection.reverse(this.col);
       assertEquals(col, reverseCol);
    }

}