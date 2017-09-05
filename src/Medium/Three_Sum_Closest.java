package Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.

 For example, given array S = {-1 2 1 -4}, and target = 1.

 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * Created by xuzhuchen on 9/5/17.
 */
public class Three_Sum_Closest {
    public int threeSumClosest(int[] num, int target) {
        int sum = target - Integer.MAX_VALUE;
        if (num.length < 3) return 0;
        Arrays.sort(num);

        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1;
                while (lo < hi) {
                    int dis = target - num[lo] - num[hi] - num[i];
                    if (  Math.abs(dis) < Math.abs(target-sum)) {
                        sum = target - dis;
                    }
                    if (dis > 0) lo++;
                    else hi--;
                }
            }
        }
        return sum;
    }
}
