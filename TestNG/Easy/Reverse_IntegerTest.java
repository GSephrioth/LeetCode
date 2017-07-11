package Easy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 *
 * Created by Elliott Chen on 6/28/17.
 */
public class Reverse_IntegerTest {
    @Test
    public void testReverse() throws Exception {
        Reverse_Integer RI = new Reverse_Integer();
        Assert.assertEquals(RI.reverse(-12341),-14321);
        Assert.assertEquals(RI.reverse(13241),14231);
        Assert.assertEquals(RI.reverse(-1),-1);
        Assert.assertEquals(RI.reverse(0),0);
        Assert.assertEquals(RI.reverse(-1234567899),0);
        Assert.assertEquals(RI.reverse(-2147483648),0);
    }

}