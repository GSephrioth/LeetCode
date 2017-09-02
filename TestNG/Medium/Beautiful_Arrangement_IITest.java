package Medium;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

/**
 * Created by xuzhuchen on 8/27/17.
 */
public class Beautiful_Arrangement_IITest {
    Beautiful_Arrangement_II BA = new Beautiful_Arrangement_II();
    @Test
    public void testConstructArray() throws Exception {
        System.out.println(Arrays.toString(BA.constructArray(999,998)));
    }

    @Test
    public void testConstructArrayII() throws Exception {

        System.out.println(Arrays.toString(BA.constructArrayII(999,998)));
    }

}