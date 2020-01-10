package unittest;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import unittest.Kategori1841720121Ray;

/**
 *
 * @author Asus
 */
public class Kategori1841720121RayTest extends TestCase {

    Kategori1841720121Ray instance;

    public Kategori1841720121RayTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Kategori1841720121Ray("Comics", "Comics is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchRay method, of class Kategori1841720078Ray.
     */
    @Test
    public void testSearchRay() {
        System.out.println("save test");
        this.instance.saveRay();
        ArrayList<Kategori1841720121Ray> expResult = instance.getByNamaAndKeteranganRay(instance.getNamaRay(), instance.getKeteranganRay());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveRay method, of class Kategori1841720078Ray.
     */
    @Test
    public void testSaveRay() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720121Ray> result = instance.searchRay(keyword);
        ArrayList<Kategori1841720121Ray> expResult = instance.getByNamaAndKeteranganRay(keyword, "");
        assertEquals(expResult.size(), result.size());
    }
}
