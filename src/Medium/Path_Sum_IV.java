package Medium;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * If the depth of a tree is smaller than 5, then this tree can be represented by a list of three-digits integers.
 *
 * For each integer in this list:
 * The hundreds digit represents the depth D of this node, 1 <= D <= 4.
 * The tens digit represents the position P of this node in the level it belongs to, 1 <= P <= 8.
 * The position is the same as that in a full binary tree.
 *
 * The units digit represents the value V of this node, 0 <= V <= 9.
 * Given a list of ascending three-digits integers representing a binary with the depth smaller than 5. You need to return the sum of all paths from the root towards the leaves.
 * Created by xuzhuchen on 8/26/17.
 */
public class Path_Sum_IV {
    public int pathSum(int[] nums) {
        Arrays.sort(nums);
        int[] count =new int[nums.length];
        int sum = 0, parentIndex;

        for (int i = nums.length-1; i >= 0; i--) {
            if(count[i] == 0) count[i] = 1;
            parentIndex = findParent(nums,nums[i],i);
            if(parentIndex > -1) count[parentIndex] += count[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            sum += count[i]*getDigit(nums[i]);
        }
        return sum;
    }
    int getHunderds(int x){
        return x/100;
    }
    int getTens(int x){
        return (x%100)/10;
    }
    int getDigit(int x){
        return x%10;
    }
    int findParent(int[] nums,int x,int i){
        int D = getHunderds(x);
        int P = getTens(x);
        D-=1;
        P=(P+1)/2;
        for (; i >= 0; i--) {
           if(D == getHunderds(nums[i]) && P == getTens(nums[i]))
               return i;
        }
        return -1;
    }

}
