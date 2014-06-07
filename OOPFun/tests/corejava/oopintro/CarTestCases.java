package corejava.oopintro;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import corejava.oopintro.Audi;
import corejava.oopintro.BMW;
import corejava.oopintro.Chevrolet;
import corejava.oopintro.Lada;


public class CarTestCases {

    private Lada lada;
    private Chevrolet chevrolet;
    private Audi audi;
    private BMW bmw;

    @Before
    public void setUp() throws Exception {
        this.lada = new Lada();
        this.chevrolet = new Chevrolet();
        this.audi = new Audi();
        this.bmw = new BMW();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testLadaToString() {
        assertEquals("Lada", lada.toString());
    }
    
    @Test
    public void testChevroletToString() {
        assertEquals("Chevrolet", chevrolet.toString());
    }
    
    @Test
    public void testAudiToString() {
        assertEquals("Audi", audi.toString());
    }
    
    @Test
    public void testBMWToString() {
        assertEquals("BMW", bmw.toString());
    }

}
