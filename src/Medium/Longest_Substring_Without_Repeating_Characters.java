package Medium;

import java.util.HashSet;

/**
 *
 * Created by xuzhuchen on 6/27/17.
 */
class Longest_Substring_Without_Repeating_Characters {
    int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, max = 0;
        HashSet<Character> HS = new HashSet<>();
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
}
