package Easy;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuzhuchen on 9/9/17.
 */
public class Longest_Continuous_Increasing_SubsequenceTest {
    Longest_Continuous_Increasing_Subsequence LCIS= new Longest_Continuous_Increasing_Subsequence();
    @Test
    public void testFindLengthOfLCIS() throws Exception {
        assertEquals(LCIS.findLengthOfLCIS(new int[]{1,3,5,4,7}),3);
        assertEquals(LCIS.findLengthOfLCIS(new int[]{2,2,2,2,2}),1);
        assertEquals(LCIS.findLengthOfLCIS(new int[]{}),0);
        assertEquals(LCIS.findLengthOfLCIS(new int[]{1}),1);
    }

}