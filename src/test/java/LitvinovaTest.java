import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LitvinovaTest {

    Litvinova litvinova;

    @Before
    public void setUp() throws Exception {
        this.litvinova = new Litvinova();
    }
    @Test
    public void testSumm() {
        assertEquals("function summ int result : ", 10, this.litvinova.summ(6, 4));
        assertEquals((float) 0.534, this.litvinova.summ((float) 0.033, (float) 0.500), 0.002);
    }
    @Test
    public void testMultiplic() {
        assertEquals("funtion multiplic int result: ", 4, this.litvinova.multiplic(4,1));
        assertEquals((float) 0.25, this.litvinova.multiplic((float) 0.5,(float) 0.5), 0.02);
    }
    @Test
    public void testAB() {
        assertEquals("function AB int result: ", (float) 2, this.litvinova.AB(2,4));
        assertEquals(0.148, this.litvinova.AB((float) 0.2, (float) 3.65), 0.001);
        assertEquals("function AB int result: ", true, Float.isInfinite(this.litvinova.AB((float) 1.5, (float) 5)));
    }
}
