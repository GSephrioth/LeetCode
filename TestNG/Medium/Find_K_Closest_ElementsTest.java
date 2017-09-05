package Medium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by xuzhuchen on 9/5/17.
 */
public class Find_K_Closest_ElementsTest {
    Find_K_Closest_Elements FKCE = new Find_K_Closest_Elements();
    @Test(dataProvider = "list")
    public void testFindClosestElements(List<Integer> arr,int k,int x, List<Integer> exp) throws Exception {
        assertEquals(FKCE.findClosestElements(arr,k,x),exp);
    }

    @DataProvider(name = "list")
    private Object[][] data() throws Exception {
        int k1 = 4, x1 = -1;
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7}));
        List<Integer> result1 = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4}));

        int k2 = 3, x2 = 10;
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,5,6,7}));
        List<Integer> result2 = new ArrayList<>(Arrays.asList(new Integer[]{5,6,7}));

        return new Object[][] {
//                {nums1,k1,x1,result1},
                {nums2,k2,x2,result2},
        };
    }

}