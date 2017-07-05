package Easy;

/**
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a^2 + b^2 = c.
 *
 * Example 1:
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 *
 * Example 2:
 * Input: 3
 * Output: False
 *
 * Created by xuzhuchen on 7/3/17.
 */
class Sum_of_Square_Numbers {
     boolean judgeSquareSum(int c) {
        int a = 0, b, end = (int) Math.sqrt(c)+1;
//        System.out.println(end);
        while(a < end){
            b =(int)Math.sqrt(c - a*a);
            if ((a*a + b*b) == c){
                return true;
            }
            a++;
        }
        return false;
    }
}
