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
public class Four_SumTest {
    Four_Sum FS = new Four_Sum();
    @Test(dataProvider = "dp")
    public void testFourSum(int[] num, int target ,List<List<Integer>> expected) throws Exception {
        assertEquals(FS.fourSum(num,target),expected);
    }

    @DataProvider(name = "dp")
    private Object[][] dataForFourSum(){
        int[] num1 = new int[]{-1,0,0,0,0,0,1,1,1,1,1,1,2,5,1,2};
        int target1 = 1;
        List<List<Integer>> result1 = new LinkedList<>();
        result1.add(Arrays.asList(new Integer[]{-1,0,0,2}));
        result1.add(Arrays.asList(new Integer[]{-1,0,1,1}));
        result1.add(Arrays.asList(new Integer[]{0,0,0,1}));
        return new Object[][]{
                {num1,target1,result1}
        };
    }

}