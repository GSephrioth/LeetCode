package Easy;


/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * Note:
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows
 * Created by xuzhuchen on 6/27/17.
 */
class Reverse_Integer {

    int reverse(int x) {
        int rev = 0;
        int digit = 0;
        while (x != 0) {
            digit = x % 10;
            rev = rev * 10 + digit; // add a new digit to tail of rev
            if ((rev - digit) % 10 != 0) // deal with overflow
                return 0;
            x = x / 10; // delete the last digit of x
        }
        return rev;
    }

}
