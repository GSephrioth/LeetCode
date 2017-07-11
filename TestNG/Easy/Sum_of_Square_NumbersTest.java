package Easy;

import Easy.Sum_of_Square_Numbers;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 *
 * Created by Elliott Chen on 7/3/17.
 */
public class Sum_of_Square_NumbersTest {
    @Test
    public void testJudgeSquareSum() throws Exception {
        Sum_of_Square_Numbers SSN = new Sum_of_Square_Numbers();
        assertEquals(SSN.judgeSquareSum(1),true);
        assertEquals(SSN.judgeSquareSum(2),true);
        assertEquals(SSN.judgeSquareSum(3),false);
        assertEquals(SSN.judgeSquareSum(4),true);
        assertEquals(SSN.judgeSquareSum(5),true);
        assertEquals(SSN.judgeSquareSum(8),true);
    }

}