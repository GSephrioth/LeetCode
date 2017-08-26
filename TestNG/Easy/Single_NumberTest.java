package Easy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 *
 * Created by xuzhuchen on 8/26/17.
 */
public class Single_NumberTest {
    Single_Number SN = new Single_Number();

    @Test(dataProvider = "inputs")
    public void testSingleNumber(int[] nums,int expected) throws Exception {
        assertEquals(SN.singleNumber(nums),expected);
    }

    @DataProvider(name = "inputs")
    public Object[][] provideInputs(){
        int[] nums1 = {1};
        int[] nums2 = {1,2,4,2,5,6,5,4,1};
        int[] nums3 = {1,4,6,2,3,5,2,5,4,1,3};
        int expected1 = 1,expected2 = 6,expected3 = 6;
        return new Object[][] {
                {nums1, expected1} ,
                {nums2, expected2} ,
                {nums3, expected3}
        };
    }
}