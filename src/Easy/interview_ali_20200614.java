package Easy;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author xuzhu.chen
 * @since 2020-06-14
 */
public class interview_ali_20200614 {
    /**
     * 1、题目：有序int数组中，除了其中一个数字外，每个数字均连续重复了两次。请编写一个函数找出单独的那个数字
     * 例如：
     * 输入: [1,1,2,2,4,5,5,6,6]
     * 输出: 4
     */

    public static Integer findSingleNumber(ArrayList<Integer> inputList){
        if(inputList == null || inputList.size() <= 0){
            return null;
        }
        boolean psame = true;
        int previous = inputList.get(0) - 1;
        for(Integer current: inputList){
            if(previous == current){
                psame = true;
            }else{
                if(!psame){
                    return previous;
                }
                psame = false;
            }
            previous = current;
        }
        return previous;
    }

    public static void findNumAppearOnce(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        System.out.println(result);
    }

    /**
     * 2、输入描述:
     * 输入是一个仅包含字母、空白字符组成的字符串。
     * ex. "trEe traversAl"
     * <p>
     * 输出描述：
     * 过滤重复的字符，仅保留第一次出现。
     * ex. "trE avsl"
     */

    public static String duplicCharFilter(String str) {
        if (str == null || str.length() <= 0) {
            return new String();
        }
        int i = 0;
        HashSet<Character> charSet = new HashSet<>(53);
        StringBuilder sb = new StringBuilder();
        for (; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!charSet.contains(currentChar)) {
                sb.append(currentChar);
                charSet.add(Character.toUpperCase(currentChar));
                charSet.add(Character.toLowerCase(currentChar));
            }
        }
        return sb.toString();
    }

}
