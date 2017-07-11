package Medium;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Example:
 * Input: "cbbd"
 * Output: "bb"
 *
 * Created by Elliott Chen on 7/5/17.
 */
class Longest_Palindromic_Substring {
    //  My solution 60%
    String longestPalindrome(String s) {
        int begin = 0; // index of first char of result sequence
        int end = 0; // index of last char of result sequence + 1
        char[] charArray = s.toCharArray();
        for (int first = 0; first < charArray.length; first++) {

            // find continuous same chars
            int common = 1;
            while (first + common < charArray.length && charArray[first + common] == charArray[first]) {
                common++;
            }

            // cores
            int mirror = 1 , last = first+common-1 ;
            int len = Math.min(first, charArray.length - last - 1);
            while (mirror <= len) {
                if (charArray[last + mirror] != charArray[first - mirror]) {
                    break;
                }
                mirror++;
            }

            // save the longest pattern
            if (2*(mirror-1)+common > end - begin) {
                begin = first - (mirror-1);
                end = last + mirror;
            }

        }
        return s.substring(begin,end);
    }
//
//    // Others solution 80%
//    private int lo, maxLen;
//    public String longestPalindrome(String s) {
//
//        ////O(n^2) time complexity and O(1) space
//
//        int len = s.length();
//        if (len < 2)
//            return s;
//
//        for (int i = 0; i < len-1; i++) {
//            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
//            extendPalindrome(s, i, i+1); //assume even length.
//        }
//        return s.substring(lo, lo + maxLen);
//
//    }
//    private void extendPalindrome(String s, int j, int k) {
//        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
//            j--;
//            k++;
//        }
//        if (maxLen < k - j - 1) {
//            lo = j + 1;
//            maxLen = k - j - 1;
//        }
//    }
}
