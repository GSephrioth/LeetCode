package Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target?
 * Find all unique quadruplets in the array which gives the sum of target.
 *
 * Note: The solution set must not contain duplicate quadruplets.
 *
 * For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
 *
 * A solution set is:
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 * Created by xuzhuchen on 9/5/17.
 */
public class Four_Sum {
    // AC
    public List<List<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int j = 0; j < num.length-3; j++) {
            if(j == 0 || (j > 0 && num[j] != num[j-1])){
                for (int i = j+1; i < num.length-2; i++) {
                    if (i == j+1 || (i > j+1 && num[i] != num[i-1])) {
                        int lo = i+1, hi = num.length-1, sum = target -num[j] - num[i];
                        while (lo < hi) {
                            if (num[lo] + num[hi] == sum) {
                                res.add(Arrays.asList(num[j],num[i], num[lo], num[hi]));
                                while (lo < hi && num[lo] == num[lo+1]) lo++;
                                while (lo < hi && num[hi] == num[hi-1]) hi--;
                                lo++; hi--;
                            } else if (num[lo] + num[hi] < sum) lo++;
                            else hi--;
                        }
                    }
                }
            }

        }
        return res;
    }


}
