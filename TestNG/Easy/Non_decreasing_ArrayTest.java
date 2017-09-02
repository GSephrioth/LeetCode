package Easy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 *
 * Created by xuzhuchen on 8/26/17.
 */
public class Non_decreasing_ArrayTest {
    Non_decreasing_Array NdA = new Non_decreasing_Array();
    @Test(dataProvider = "inputs")
    public void testCheckPossibility(int[] nums, boolean expected) throws Exception {
        assertEquals(NdA.checkPossibility(nums),expected);
    }

    @DataProvider(name = "inputs")
    public Object[][] provideInputs(){
        int[] nums1 = {2,3,3,2,4};
        int[] nums2 = {4,2,3};
        int[] nums3 = {4,3,2};
        boolean expected1 = true,expected2 = true,expected3 = false;
        return new Object[][] {
                {nums1, expected1} ,
                {nums2, expected2} ,
                {nums3, expected3}
        };
    }

}