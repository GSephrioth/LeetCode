package Hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * Created by Elliott Chen on 7/3/17.
 */
public class Median_of_Two_Sorted_ArraysTest {
    @Test
    public void testFindMedianSortedArrays() throws Exception {
        Median_of_Two_Sorted_Arrays MTSA = new Median_of_Two_Sorted_Arrays();

        int[] num1 = {1, 3}, num2 = {2};
        Assert.assertEquals(MTSA.findMedianSortedArrays(num1, num2), 2.0);

        num1 = new int[]{1, 2};
        num2 = new int[]{3, 4};
        Assert.assertEquals(MTSA.findMedianSortedArrays(num1, num2), 2.5);

        num1 = new int[]{1, 2, 8, 9};
        num2 = new int[]{3, 4, 5, 6, 7};
        Assert.assertEquals(MTSA.findMedianSortedArrays(num1, num2), 5.0);

    }

}