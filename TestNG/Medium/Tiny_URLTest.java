package Medium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.LinkedList;

import static org.testng.Assert.*;

/**
 *
 * Created by Elliott Chen on 7/6/17.
 */
public class Tiny_URLTest {
    private Tiny_URL TURL = new Tiny_URL();
    private String[] originalURLs = {
            "https://leetcode.com/problems/design-tinyurl",
            "https://leetcode.com/problems/design",
            "https://leetcode.com/problems/abcdefghter",
            "https://leetcode.com/problems/design-tinyurltinyurltinyurltinyurltinyurltinyurltinyurl"
    };
    private LinkedList<String> tinyURLs = new LinkedList<>();

    @Test
    public void testEncode() throws Exception {
        System.out.println("test1");
        String str;
        for(String temp: originalURLs){
            str = TURL.encode(temp);
            tinyURLs.add(str);
//            assertEquals(str,"http://tinyurl.com/4e9iAk");
        }
    }

    @Test
    public void testDecode() throws Exception {
        System.out.println("test2");
        int i =0 ;
        for(String temp: tinyURLs){
            i++;
            assertEquals(temp,originalURLs[i]);
        }
    }

}