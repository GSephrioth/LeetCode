package Medium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 *
 * Created by xuzhuchen on 9/2/17.
 */
public class Kth_Smallest_Element_in_Sorted_MatrixTest {
    Kth_Smallest_Element_in_Sorted_Matrix KS = new Kth_Smallest_Element_in_Sorted_Matrix();
    @Test(dataProvider = "data")
    public void testKthSmallest(int[][] matrix, int k, int exp) throws Exception {
        assertEquals(KS.kthSmallest(matrix,k), exp);
    }

    @DataProvider(name = "data")
    public Object[][] provideInputStrs(){
        int[][] matrix1 = {
                {1,5,7,10},
                {2,7,8,11},
                {4,8,10,13},
                {6,9,14,22}
        },
        matrix2 ={
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };
        int k1 = 8,k2 = 8;
        int expected1 = 8, expected2 = 13;
        return new Object[][] {
                { matrix1, k1, expected1},
                { matrix2, k2, expected2}
        };
    }
}