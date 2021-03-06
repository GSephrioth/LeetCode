package Medium;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Implement a magic directory with buildDict, and search methods.

 For the method buildDict, you'll be given a list of non-repetitive words to build a dictionary.

 For the method search, you'll be given a word, and judge whether if you modify exactly one character into another character in this word, the modified word is in the dictionary you just built.

 Example 1:
 Input: buildDict(["hello", "leetcode"]), Output: Null
 Input: search("hello"), Output: False
 Input: search("hhllo"), Output: True
 Input: search("hell"), Output: False
 Input: search("leetcoded"), Output: False
 Note:
 You may assume that all the inputs are consist of lowercase letters a-z.
 For contest purpose, the test data is rather small by now. You could think about highly efficient algorithm after the contest.
 Please remember to RESET your class variables declared in class MagicDictionary, as static/class variables are persisted across multiple test cases. Please see here for more details.
 * Created by xuzhuchen on 9/9/17.
 */
public class MagicDictionary {
    private HashMap<String,Boolean> dir;
    private HashSet<String> dict;


    /** Initialize your data structure here. */
    public MagicDictionary() {
        dir = new HashMap<>();
        dict = new HashSet<>();
    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for (int i = 0; i < dict.length; i++) {
            char[] temp = dict[i].toCharArray();
            this.dict.add(dict[i]);
            for (int j = 0; j < temp.length; j++) {
                temp = dict[i].toCharArray();
                temp[j] = '0';
                if (dir.containsKey(new String(temp))){
                    dir.put(new String(temp),true);
                }else {
                    dir.put(new String(temp),false);
                }

            }
        }

    }

    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        char[] temp = word.toCharArray();
        for (int j = 0; j < temp.length; j++) {
            temp = word.toCharArray();
            temp[j] = '0';
            String str = new String(temp);
            if (dir.containsKey(str)){
                if (dir.get(str)){
                    return true;
                }else {
                    if (!this.dict.contains(word))
                        return true;
                }

            }
        }
        return false;
    }
}
/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */
