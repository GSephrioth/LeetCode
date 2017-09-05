package Easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * Created by xuzhuchen on 7/12/17.
 */
class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        char temp;
        int len = Integer.MAX_VALUE;
        // find length of shortest string
        if(strs == null)
            return null;
        else if(strs.length < 1)
            return "";
        else if(strs.length < 2)
            return strs[0];

        for (String str : strs) {
            if (len > str.length())
                len = str.length();
        }

        for (int i = 0; i < len; i++) {
            temp = strs[0].charAt(i);
            boolean contains = true;
            for (String str : strs) {
                if(str.charAt(i) != temp){
                    contains = false;
                    break;
                }
            }
            if (contains) sb.append(temp);
            else break;
        }


        return sb.toString();
    }
}
