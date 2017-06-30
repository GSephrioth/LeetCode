package Medium;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Created by xuzhuchen on 6/27/17.
 */
class Longest_Substring_Without_Repeating_Characters {
    //单次遍历字符串，将start和end之间的char存储于HS，
//    int lengthOfLongestSubstring(String s) {
//        int start = 0, end = 0, max = 0;
//        HashSet<Character> HS = new HashSet<>();
//        while (end < s.length()) {
//            char endchar = s.charAt(end);
//            if (HS.contains(endchar)) {
//                if (max < end - start) {
//                    max = end - start;
//                }
//                while (s.charAt(start) != endchar) {
//                    HS.remove(s.charAt(start));
//                    start++;
//                }
//                start++;
//            } else {
//                HS.add(endchar);
//            }
//            end++;
//        }
//        max = Math.max(max, end - start);
//        return max;
//    }

    //单次遍历字符串，记录两个相同char之间下标之差
    int lengthOfLongestSubstring(String s) {
        int[] map = new int[256];
        Arrays.fill(map, -1);
        int max = 0;
        int last = -1;
        for(int i = 0; i < s.length(); i++) {
            last = Math.max(map[s.charAt(i)], last);
            map[s.charAt(i)] = i;
            max = Math.max(max, i - last);
        }
        return max;
    }
}
