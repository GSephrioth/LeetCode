package Easy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuzhuchen on 7/12/17.
 */
public class Longest_Common_PrefixTest {

    Longest_Common_Prefix LCP = new Longest_Common_Prefix();

    @Test(dataProvider = "inputStrs")
    public void testLongestCommonPrefix(String[] strs,String expected) throws Exception {
        assertEquals(LCP.longestCommonPrefix(strs),expected);
    }

    @DataProvider(name = "inputStrs")
    public Object[][] provideInputStrs(){
        String[] strs1 = {
                "absccasdgwe",
                "abscbew",
                "abscqwe",
                "abscqw",
                "abscwqeq",
                "abscds"
        },
                strs2 = {"abc","cacb"};
        String expected1 = "absc", expected2 = "";
        return new Object[][] { { strs1, expected1} ,{strs2,expected2}};
    }

}