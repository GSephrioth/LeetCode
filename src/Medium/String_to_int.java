package Medium;

/**
 * Implement atoi to convert a string to an integer.
 * <p>
 * Hint: Carefully consider all possible input cases.
 * If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * "abc" -> 0
 * "a1b24b" -> 0
 * "123868761827612" -> INT_MAXIMUM
 * "-123868761827612" -> INT_MINIMUM
 * "1ab3d" -> 1
 * "34-2vca" -> 34
 * "+1" -> 1
 * <p>
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
 * You are responsible to gather all the input requirements up front.
 * <p>
 * Created by xuzhuchen on 7/10/17.
 */
public class String_to_int {
    public int myAtoi(String str) {
        char[] inputArray = str.trim().toCharArray();
        int result = 0;
        int current = 0;
        int i;
        if (inputArray.length > 0 && inputArray[0] == '-') {
            for (i = 1; i < inputArray.length; i++) {
                current = inputArray[i] - 48;
                if (current < 0 || current > 9) {
                    return result;
                }

                result *= 10;
                result -= current;
                if (result > 0 || (result + current) % 10 != 0) {
                    return Integer.MIN_VALUE;
                }
            }
        } else {
            if (inputArray.length > 0 && inputArray[0] == '+')
                i = 1;
            else i = 0;
            for (; i < inputArray.length; i++) {
                current = inputArray[i] - 48;
                if (current < 0 || current > 9) {
                    return result;
                }
                result *= 10;
                result += current;
                if (result < 0 || (result - current) % 10 != 0) {
                    return Integer.MAX_VALUE;
                }
            }
        }

        return result;
    }
}
