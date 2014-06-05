package corejava.tddintro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReducePathTestCase {
    private ReducePath reducePath;

    @Before
    public void setUp() throws Exception {
        this.reducePath = new ReducePath();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testReduceFilePathSingleSlash() {
        String path = "/";
        assertEquals("/", reducePath.reducePath(path));
    }

    @Test
    public void testReduceFilePathGoBack() {
        String path = "/srv/../";
        assertEquals("/", reducePath.reducePath(path));
    }

    @Test
    public void testReduceFilePathRemoveLastSlash() {
        String path = "/srv/www/htdocs/wtf/";
        assertEquals("/srv/www/htdocs/wtf", reducePath.reducePath(path));
    }

    @Test
    public void testReduceFilePathDoNothing() {
        String path = "/srv/www/htdocs/wtf";
        assertEquals("/srv/www/htdocs/wtf", reducePath.reducePath(path));
    }

    @Test
    public void testReduceFilePathStayInSameFolderMultipleTimes() {
        String path = "/srv/./././././";
        assertEquals("/srv", reducePath.reducePath(path));
    }

    @Test
    public void testReduceFilePathMultipleSlashes() {
        String path = "/etc//wtf/";
        assertEquals("/etc/wtf", reducePath.reducePath(path));
    }

    @Test
    public void testReduceFilePathPointlessSlashes() {
        String path = "//////////////";
        assertEquals("/", reducePath.reducePath(path));
    }

}
