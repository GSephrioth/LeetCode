package Easy;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

/**
 *
 * Created by xuzhuchen on 6/28/17.
 */
public class TwoSumTest {
    @Test
    public void testTwoSum() throws Exception {
        TwoSum TS = new TwoSum();
        int[] input = {3,2,4}, result = {0,1};
        assertEquals(TS.twoSum(input,5),result);
        int[] input2 = {3,2,4}, result2 = {1,2};
        assertEquals(TS.twoSum(input2,6),result2);

    }

}