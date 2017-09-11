package Easy;

/**
 * Created by xuzhuchen on 9/9/17.
 */
public class Longest_Continuous_Increasing_Subsequence {
    public int findLengthOfLCIS(int[] nums) {
        int i = 0,length = 1, maxLength = 1;
        if (nums.length <= 1) return nums.length;
        while (i < nums.length){
            length = 1;
            while (i+length < nums.length && nums[i+length-1] < nums[i+length]){
                length++;
                maxLength = Math.max(length,maxLength);
            }
            i++;
        }
        return maxLength;
    }
}
