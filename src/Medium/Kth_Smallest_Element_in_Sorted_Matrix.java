package Medium;

/**
 * Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.
 *
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 *
 * Example:
 *
 * matrix = [
 * [ 1,  5,  9],
 * [10, 11, 13],
 * [12, 13, 15]
 * ],
 * k = 8,
 *
 * return 13.
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ n^2.
 *
 *
 * Created by xuzhuchen on 9/2/17.
 */
public class Kth_Smallest_Element_in_Sorted_Matrix {
    // too slow col is also in ascending order
//    public int kthSmallest(int[][] matrix, int k) {
//        int n = matrix.length;
//        int[] indexes = new int[n]; //current index for each line, start with all 0
//        int count = 0, cur = matrix[0][0];
//        while (count < k){
//            int min = Integer.MAX_VALUE,index = 0;
//            for (int i = 0; i < n; i++) {
//                if (indexes[i] >= n) continue; // row finished
//
//                if (min > matrix[i][indexes[i]]){
//                    min = matrix[i][indexes[i]];
//                    index=i;
//                }
//            }
//            indexes[index]++;
//            cur = min;
//            count++;
//
//        }
//        return cur;
//    }

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0], right = matrix[n-1][n-1] + 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            int count = 0, j = n - 1;
            for(int i = 0; i < n; i++) {
                while(j >= 0 && matrix[i][j] > mid) {
                    j--;
                }
                count += j + 1;
            }
            if(count < k) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }


}
