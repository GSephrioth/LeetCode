package Medium;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 *
 * Created by xuzhuchen on 6/28/17.
 */
public class AddTwoNumbersTest {
    @Test
    public void testAddTwoNumbers() throws Exception {
        ListNode l1 = new ListNode(1, 2, 3);
        ListNode l2 = new ListNode(2, 3, 8);
        ListNode l3 = new ListNode(9);
        ListNode r1 = new ListNode(3,5,1);
        r1.addTail(1);
        ListNode r2 = new ListNode(0,3,3);
        ListNode r3 = new ListNode(1,4,8);

        AddTwoNumbers ATN = new AddTwoNumbers();
        Assert.assertEquals(ATN.addTwoNumbers(l1,l2),r1);
        Assert.assertEquals(ATN.addTwoNumbers(l1,l3),r2);
        Assert.assertEquals(ATN.addTwoNumbers(l2,l3),r3);
    }
}