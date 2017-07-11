package Hard;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 *   compute how much water it is able to trap after raining.
 *
 * For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 *
 * Created by Elliott Chen on 7/11/17.
 */
class Trapping_Rain_Water {
    // like container with most water
    int trap(int[] height) {
        if(height.length < 3) return 0;
        int amount = 0;
        int left = 0,right = height.length-1, curHeight = 0;
        while (left < right){
            amount += (right - left+1)* (Math.min(height[right],height[left]) - curHeight);

            if(height[right] < height[left]){
                curHeight = height[right];
                while (left < right && curHeight >= height[right]) right --;

            }else {
                curHeight = height[left];
                while (left < right && curHeight >= height[left]) left ++;

            }
        }
        amount += Math.abs(height[right]-curHeight);
        for (int i : height) {
            amount -= i;
        }
        return amount;
    }
}
