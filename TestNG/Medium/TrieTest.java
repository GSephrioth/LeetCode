package Medium;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Created by xuzhuchen on 3/21/18.
 */
public class TrieTest {
    Trie t = new Trie();
    @Test
    public void testInsert() throws Exception {
        t.insert("abcd");
    }

    @Test
    public void testSearch() throws Exception {
        t.insert("abcd");
        Assert.assertEquals(t.search("abcd"),true);
        Assert.assertEquals(t.search("ab"),false);
        Assert.assertEquals(t.search("cd"),false);
        Assert.assertEquals(t.search(""),false);
    }

    @Test
    public void testStartsWith() throws Exception {

    }

}