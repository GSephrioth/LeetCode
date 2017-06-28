package Medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 *
 * Created by xuzhuchen on 6/28/17.
 */
public class Longest_Substring_Without_Repeating_CharactersTest {
    @Test
    public void testLengthOfLongestSubstring() throws Exception {
        Longest_Substring_Without_Repeating_Characters LSWRC = new Longest_Substring_Without_Repeating_Characters();
        Assert.assertEquals(LSWRC.lengthOfLongestSubstring("abcddefddcd"),4);
        Assert.assertEquals(LSWRC.lengthOfLongestSubstring("pwwkew"),3);
    }

}