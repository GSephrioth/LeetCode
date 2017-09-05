package Medium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by xuzhuchen on 9/5/17.
 */
public class Three_Sum_ClosestTest {

    private Three_Sum_Closest TS = new Three_Sum_Closest();
    @Test(dataProvider = "list")
    public void testThreeSumClosest(int[] nums,int traget, int exp) throws Exception {
        assertEquals(TS.threeSumClosest(nums,traget),exp);
    }

    @DataProvider(name = "list")
    private Object[][] data() throws Exception {
        int[]
                nums1 = new int[]{0,1,2},
                nums3 = new int[]{0,0,0},
                nums4 = new int[]{-2,-2,-1,3,5},
                nums5 = new int[]{-4,-2,-2,-2,0,0,1,2,2,2,0,2,2,3,3,4,4,6,6,8,8};
        int traget1 = 1, traget3 = 1, traget4 = 9, traget5 = 5;
        int result1 = 3, result3 = 0, result4 = 7, result5 = 5;

        return new Object[][] {
                {nums1,traget1,result1},
                {nums3,traget3,result3},
                {nums4,traget4,result4},
                {nums5,traget5,result5},

        };
    }

}