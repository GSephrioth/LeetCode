package Medium;

import java.util.HashSet;

/**
 * Created by xuzhuchen on 6/27/17.
 */
public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, max = 0;
        HashSet HS = new HashSet();
        while (end < s.length()) {
            if (HS.contains(s.charAt(end))) {
                if (max < end - start) {
                    max = end - start;
                }
                while (s.charAt(start) != s.charAt(end)) {
                    HS.remove(s.charAt(start));
                    start++;
                }
                start++;
            } else {
                HS.add(s.charAt(end));
            }
            end++;
        }
        max = Math.max(max,end-start);
        return max;
    }

    public static void main(String args[]) {
        Longest_Substring_Without_Repeating_Characters LSWRC = new Longest_Substring_Without_Repeating_Characters();

        String str1 = "abcabcdnjefadgbcqkwn";
        System.out.println(LSWRC.lengthOfLongestSubstring(str1));
        String str2 = "pwwkew";
        System.out.println(LSWRC.lengthOfLongestSubstring(str2));
        String str3 = "c";
        System.out.println(LSWRC.lengthOfLongestSubstring(str3));
        return;
    }
}
