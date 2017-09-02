package Hard;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 *
 * Created by xuzhuchen on 9/2/17.
 */
public class Kth_smallest_Number_in_Multiplication_TableTest {
    Kth_smallest_Number_in_Multiplication_Table KS = new Kth_smallest_Number_in_Multiplication_Table();
    @Test(dataProvider = "data")
    public void testFindKthNumber(int m,int n,int k,int exp) throws Exception {
        assertEquals(KS.findKthNumber(m,n,k),exp);
    }

    @DataProvider(name = "data")
    private Object[][] data() throws Exception {

        return new Object[][] {
                {100,100,54,444},
                {3,3,5,3},
                {2,3,6,6},
        };
    }

}