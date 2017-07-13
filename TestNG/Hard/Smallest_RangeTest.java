package Hard;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * Created by xuzhuchen on 7/12/17.
 */
public class Smallest_RangeTest {


    @Test(dataProvider = "smallestRange")
    public void testSmallestRange(List<List<Integer>> nums, int[] expect) throws Exception {
        Smallest_Range SR = new Smallest_Range();
        int[] out = SR.smallestRange(nums);
        for (int i : out) {
            System.out.print(i + "\t");
        }
        System.out.println();
        assertEquals(out, expect);
    }

    @Test(enabled = false)
    public void testAdd() throws Exception {
        Smallest_Range SR = new Smallest_Range();
        Integer[] temp1 = {0, 9, 12, 20};
        Integer[] temp2 = {4, 10, 15, 24, 26};
        SR.add(Arrays.asList(temp1), 0);
        SR.add(Arrays.asList(temp2), 1);
    }

    @Test
    public void testIsSmaller() throws Exception {
        Smallest_Range SR = new Smallest_Range();
        assertEquals(SR.isSmaller(0, 5, 20, 24), false);
        assertEquals(SR.isSmaller(-5, 10, -20, 24), true);
    }

    @DataProvider(name = "smallestRange")
    public Object[][] provideSmallestRange() {
        List<List<Integer>> nums1 = new ArrayList<>();
        Integer[][] temp1 = {
                {4, 10, 15, 24, 26},
                {0, 9, 12, 20},
                {5, 18, 22, 30}
        };
        for (Integer[] ints : temp1) {
            nums1.add(Arrays.asList(ints));
        }
        int[] result1 = {20, 24};


        List<List<Integer>> nums2 = new ArrayList<>();
        Integer[] list3 = {1};
        nums2.add(Arrays.asList(list3));
        int[] result2 = {1, 1};


        List<List<Integer>> nums3 = new ArrayList<>();
        Integer[][] temp3 = {
                {1, 10, 20, 30, 40},
                {4, 9, 12, 20, 38},
                {2, 4, 6, 8, 39}
        };
        for (Integer[] ints : temp3) {
            nums3.add(Arrays.asList(ints));
        }
        int[] result3 = {8, 10};

        List<List<Integer>> nums4 = new ArrayList<>();
        Integer[][] temp4 = {
                {11, 38, 83, 84, 84, 85, 88, 89, 89, 92},
                {28, 61, 89},
                {52, 77, 79, 80, 81},
                {21, 25, 26, 26, 26, 27},
                {9, 83, 85, 90},
                {84, 85, 87},
                {26, 68, 70, 71},
                {36, 40, 41, 42, 45},
                {-34, 21},
                {-28, -28, -23, 1, 13, 21, 28, 37, 37, 38},
                {-74, 1, 2, 22, 33, 35, 43, 45},
                {54, 96, 98, 98, 99},
                {43, 54, 60, 65, 71, 75},
                {43, 46},
                {50, 50, 58, 67, 69},
                {7, 14, 15},
                {78, 80, 89, 89, 90},
                {35, 47, 63, 69, 77, 92, 94}
        };
        for (Integer[] ints : temp4) {
            nums4.add(Arrays.asList(ints));
        }
        int[] result4 = {15, 84};

        return new Object[][]{
                {nums1, result1},
                {nums2, result2},
                {nums3, result3},
                {nums4, result4}
        };
    }

}