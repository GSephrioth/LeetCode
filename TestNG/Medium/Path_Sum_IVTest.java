package Medium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 *
 * Created by xuzhuchen on 8/26/17.
 */
public class Path_Sum_IVTest {
    Path_Sum_IV PS = new Path_Sum_IV();
    @Test(dataProvider = "inputs")
    public void testPathSum(int[] nums, int expected) throws Exception {
        assertEquals(PS.pathSum(nums),expected);
    }
    @DataProvider(name = "inputs")
    public Object[][] provideInputs(){
        int[] nums1 = {113, 215, 221};
        int[] nums2 = {113, 221};
        int[] nums3 = {114,223,335};
        int expected1 = 12,expected2 = 4,expected3 = 12;
        return new Object[][] {
                {nums1, expected1} ,
                {nums2, expected2} ,
                {nums3, expected3}
        };
    }

}