package Hard;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 *
 * Created by xuzhuchen on 7/11/17.
 */
public class Trapping_Rain_WaterTest {
    @Test
    public void testTrap() throws Exception {
        Trapping_Rain_Water TRW = new Trapping_Rain_Water();

        int[] test2 = {2,0,2};
        assertEquals(TRW.trap(test2),2);

        int[] test3 = {10,9,8,7,6,5,4,3,2,1,0,1};
        assertEquals(TRW.trap(test3),1);

        int[] test4 = {0,1,3,4,5,6,5,4,3,2,2,1};
        assertEquals(TRW.trap(test4),0);

        int[] test5 = {7,6,5,4,3,2,1,4,3,22,1,61};
        assertEquals(TRW.trap(test5),49);

        int[] test1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(TRW.trap(test1),6);
    }

}