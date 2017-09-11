package Medium;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by xuzhuchen on 9/9/17.
 */
public class MagicDictionaryTest {

    @Test
    public void testBuildDict() throws Exception {
        MagicDictionary MD = new MagicDictionary();
        MD.buildDict(new String[]{"hello", "leetcode"});
        assertEquals(MD.search("hello"),false);
        assertEquals(MD.search("hhllo"),true);
        assertEquals(MD.search("hallo"),true);
        assertEquals(MD.search("hell"),false);
        assertEquals(MD.search("leetcode"),false);
        assertEquals(MD.search("leeacode"),true);

    }

}