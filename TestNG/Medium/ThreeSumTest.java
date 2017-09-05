package Medium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.*;

/**
 *
 * Created by xuzhuchen on 9/4/17.
 */
public class ThreeSumTest {
    private ThreeSum TS = new ThreeSum();
    @Test(dataProvider = "list")
    public void testThreeSum(int[] nums, List<List<Integer>> exp) throws Exception {
        assertEquals(TS.threeSum(nums).size(),exp.size());
    }

    @DataProvider(name = "list")
    private Object[][] data() throws Exception {
        int[] nums1 = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = new LinkedList<>();
        result1.add(Arrays.asList(new Integer[]{-1,0,1}));
        result1.add(Arrays.asList(new Integer[]{-1,-1,2}));

        int[] nums2 = new int[]{};
        List<List<Integer>> result2 = new LinkedList<>();

        int[] nums3 = new int[]{0,0,0};
        List<List<Integer>> result3 = new LinkedList<>();
        result3.add(Arrays.asList(new Integer[]{0,0,0}));

        int[] nums4 = new int[]{-2,-2,-1,3,5};
        List<List<Integer>> result4 = new LinkedList<>();
        result4.add(Arrays.asList(new Integer[]{-2,-1,3}));

        int[] nums5 = new int[]{-4,-2,-2,-2,0,0,1,2,2,2,0,2,2,3,3,4,4,6,6,8,8};
        List<List<Integer>> result5 = new LinkedList<>();
        result5.add(Arrays.asList(new Integer[]{-4,0,4}));
        result5.add(Arrays.asList(new Integer[]{-4,-2,6}));
        result5.add(Arrays.asList(new Integer[]{-4,1,3}));
        result5.add(Arrays.asList(new Integer[]{-4,2,2}));
        result5.add(Arrays.asList(new Integer[]{-2,-2,4}));
        result5.add(Arrays.asList(new Integer[]{-2,0,2}));
        result5.add(Arrays.asList(new Integer[]{0,0,0}));

        return new Object[][] {
                {nums1,result1},
                {nums2,result2},
                {nums3,result3},
                {nums4,result4},
                {nums5,result5},

        };
    }

}