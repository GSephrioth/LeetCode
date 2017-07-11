package Medium;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 *
 * Created by Elliott Chen on 7/10/17.
 */
class Container_With_Most_Water {
//    // 粗暴遍历 n^2 复杂度 太慢了
//    public int maxArea(int[] height) {
//        int area = 0,temp = 0;
//        for (int i = 0; i < height.length-1; i++) {
//            for (int j = i+1; j < height.length; j++) {
//                temp = (j - i) * Math.min(height[j],height[i]);
//                area = Math.max(area,temp);
//            }
//        }
//        return area;
//    }

    // good solution
    int maxArea(int[] height){
        int area = 0, temp = 0;
        int left = 0, right = height.length-1;
        while (right > left) {
            if(height[left] > height[right]){
                temp = (right - left) * height[right];
                area = Math.max(area,temp);
                right --;
            }else {
                temp = (right - left) * height[left];
                area = Math.max(area,temp);
                left ++;
            }
        }
        return area;
    }

}
