package Medium;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 *
 * Created by xuzhuchen on 7/10/17.
 */
public class String_to_intTest {
    @Test
    public void testMyAtoi() throws Exception {
        String_to_int STI = new String_to_int();
        assertEquals(STI.myAtoi(""),0);
        assertEquals(STI.myAtoi("56482"),56482);
        assertEquals(STI.myAtoi("-56482"),-56482);
        assertEquals(STI.myAtoi("asdw"),0);
        assertEquals(STI.myAtoi("-asdw"),0);
        assertEquals(STI.myAtoi("12asdw"),12);
        assertEquals(STI.myAtoi("-32asdw"),-32);
        assertEquals(STI.myAtoi("a2s4dw"),0);
        assertEquals(STI.myAtoi("7123841872817"),Integer.MAX_VALUE);
        assertEquals(STI.myAtoi("-12736871287874"),Integer.MIN_VALUE);
        assertEquals(STI.myAtoi("2147483648"),Integer.MAX_VALUE);
        assertEquals(STI.myAtoi("    10522545459"),Integer.MAX_VALUE);
        assertEquals(STI.myAtoi("   -123  45"),-123);
        assertEquals(STI.myAtoi("   12345"),12345);
    }

}