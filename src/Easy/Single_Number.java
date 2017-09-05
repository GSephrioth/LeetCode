package Easy;

import java.util.HashSet;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 *
 * Created by xuzhuchen on 8/26/17.
 */
class Single_Number {
    // toooo slow
//    public int singleNumber(int[] nums) {
//
//        if(nums == null) return 0;
//        if(nums.length%2 == 0) return 0;
//        if(nums.length == 1)return nums[0];
//
//        int result = 0;
//        HashSet<Integer> records = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(records.contains(nums[i]))
//                records.remove(nums[i]);
//            else records.add(nums[i]);
//        }
//        result =(Integer) records.toArray()[0];
//
//        return result;
//
//    }
    // using XOR
    public int singleNumber(int[] nums) {

        if(nums == null || nums.length%2 == 0) return 0;

        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            a ^= nums[i];
        }
        return a;

    }
}
