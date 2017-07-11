package Medium;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Elliott Chen on 7/5/17.
 */
public class Longest_Palindromic_SubstringTest {
    @Test
    public void testLongestPalindrome() throws Exception {
        Longest_Palindromic_Substring LPS = new Longest_Palindromic_Substring();

        assertEquals(LPS.longestPalindrome("a"),"a");
        assertEquals(LPS.longestPalindrome("aa"),"aa");
        assertEquals(LPS.longestPalindrome("aaa"),"aaa");
        assertEquals(LPS.longestPalindrome("aba"),"aba");
        assertEquals(LPS.longestPalindrome("xyzxyzzyxbyz"),"xyzzyx");
        assertEquals(LPS.longestPalindrome("abbcdedss"),"ded");
    }

}