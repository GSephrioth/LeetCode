package Easy;

import java.util.Arrays;

/**
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 *
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 *
 * Example 1:
 * Input: [4,2,3]
 * Output: True
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * Example 2:
 * Input: [4,2,1]
 * Output: False
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 *
 * Note: The n belongs to [1, 10,000].
 * Created by xuzhuchen on 8/26/17.
 */
class Non_decreasing_Array {
    public boolean checkPossibility(int[] nums) {
        if(nums.length <= 2) return true;
        int pre = 0,cur = 1, count = 0;
        boolean flag = true;
        int[] copy = Arrays.copyOf(nums,nums.length);
        while(cur < nums.length) {
            if(nums[pre] > nums[cur]) {
                count ++;
                if(count >= 2) {flag = false;break;}
                nums[pre] = pre>0 ? nums[pre-1] : 0;
                continue;
            }
            cur ++;
            pre ++;
        }
        if(flag) return flag;
        else {
            pre = 0;cur = 1;count = 0;
            while(cur < copy.length) {
                if(copy[pre] > copy[cur]) {
                    count ++;
                    copy[cur] = copy[pre];
                }
                cur ++;
                pre ++;
            }
        }
        return count <2;
    }
}
