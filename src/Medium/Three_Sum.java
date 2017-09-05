package Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note: The solution set must not contain duplicate triplets.
 * <p>
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * Created by xuzhuchen on 9/4/17.
 */
class Three_Sum {
    List<Integer> getResult(int x, int y, int z) {
        List<Integer> result = new LinkedList<>();
        result.add(x);
        result.add(y);
        result.add(z);
        return result;
    }
    // basic idea, traversal the nums array, find 3rd based on 1st and 2nd
    // failed : Time limited exceeded
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<Integer> result;
//        List<List<Integer>> resultList = new LinkedList<>();
//
//        if (nums.length < 3) return resultList;
//
//        // 000
//        int count0 = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) count0++;
//        }
//        if (count0 >= 3) resultList.add(getResult(0, 0, 0));
//
//        for (int i = 0; i < nums.length-2; i++) {
//            for (int j = i+1; j < nums.length-1; j++) {
//                kloop:for (int k = j+1; k < nums.length; k++) {
//                    if (nums[i]+nums[j]+nums[k] == 0){
//                        // prevent duplicate
//                        for (List<Integer> list : resultList){
//                            if(list.contains(nums[i]) && list.contains(nums[j]) && list.contains(nums[k])) continue kloop;
//                        }
//                        resultList.add(getResult(nums[i],nums[j],nums[k]));
//                    }
//                }
//            }
//        }
//        return resultList;
//    }


    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }

}
