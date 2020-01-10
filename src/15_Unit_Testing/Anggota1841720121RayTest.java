package unittest;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import unittest.Anggota1841720121Ray;

/**
 *
 * @author Asus
 */
public class Anggota1841720121RayTest extends TestCase {

    Anggota1841720121Ray instance;

    public Anggota1841720121RayTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Anggota1841720121Ray("Ray", "Jl. Abdillah", "085877990684");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchRay method, of class Anggota1841720121Ray.
     */
    @Test
    public void testSearchRay() {
        System.out.println("save test");
        this.instance.saveRay();
        ArrayList<Anggota1841720121Ray> expResult = instance.getByNamaAndAlamatAndTeleponRay(instance.getNamaRay(), instance.getAlamatRay(), instance.getTeleponRay());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveRay method, of class Anggota1841720121Ray.
     */
    @Test
    public void testSaveRay() {
        System.out.println("search test");
        String keyword = "I Zoel";
        ArrayList<Anggota1841720121Ray> result = instance.searchRay(keyword);
        ArrayList<Anggota1841720121Ray> expResult = instance.getByNamaAndAlamatAndTeleponRay(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }
}
