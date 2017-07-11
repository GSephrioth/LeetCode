package Medium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Elliott Chen on 7/3/17.
 */
public class Lexicographical_NumbersTest {

    @Test
    public void testLexicalOrder() throws Exception {
        Lexicographical_Numbers LN = new Lexicographical_Numbers();
//        Integer[] i = new Integer[] {1,10,11,12,13,14,15,16,17,18,19,2,20,21,22,23,24,25,26,27,28,29,3,30,31,32,33,34,4,5,6,7,8,9};
//        List<Integer> list = new ArrayList<Integer>(Arrays.asList(i));
//        assertEquals(LN.lexicalOrder(34),list);

        long startTime = System.currentTimeMillis(); // 获取开始时间
        LN.lexicalOrder(12444); // 测试的代码段
        long endTime = System.currentTimeMillis(); // 获取结束时间
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
    }

    @BeforeClass
    public void testMyIntCreator() throws Exception{
        MyInt mi = new MyInt(4890321);
    }

    @Test
    public void testMyIntCompareTo() throws Exception{
        MyInt mi1 = new MyInt(4890321);
        MyInt mi2 = new MyInt(480321);
        MyInt mi3 = new MyInt(4891321);
        MyInt mi4 = new MyInt(4890321);
        assertEquals(mi1.compareTo(mi2),1);
        assertEquals(mi1.compareTo(mi3),-1);
        assertEquals(mi2.compareTo(mi3),-1);
        assertEquals(mi1.compareTo(mi4),0);
    }

    @Test
    public void testGetIntegers() throws Exception{
        MyInt mi = new MyInt(1234567);
        assertEquals(mi.getIntegers(),1234567);
    }

}