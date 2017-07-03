package Hard;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 * <p>
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 * <p>
 * Created by xuzhuchen on 7/3/17.
 */
class Median_of_Two_Sorted_Arrays {
    //循环实现
    double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mid = 0;
        int len = nums1.length + nums2.length;
        boolean isEven = len % 2 == 0;
        int i = 0, j = 0, count = 0, count_end = len / 2 + 1;
        if (isEven) {
            int k = 0, kplus = 0;
            while (count < count_end) {
                k = kplus;
                count += 1;
                if (i >= nums1.length) { // nums1 遍历完了，继续遍历 nums2
                    kplus = nums2[j];
                    j++;
                } else if (j >= nums2.length) { // nums2 遍历完了，继续遍历 nums1
                    kplus = nums1[i];
                    i++;
                } else {
                    if (nums1[i] <= nums2[j]) { // nums1，nums2 均有数据，继续遍历
                        kplus = nums1[i];
                        i++;
                    } else {
                        kplus = nums2[j];
                        j++;
                    }
                }
            }
            mid = (double) (k + kplus) / 2;

        } else {
            while (count < count_end) {
                if (i >= nums1.length) { // nums1 遍历完了，继续遍历 nums2
                    mid = nums2[j];
                    j++;
                } else if (j >= nums2.length) { // nums2 遍历完了，继续遍历 nums1
                    mid = nums1[i];
                    i++;
                } else {
                    if (nums1[i] <= nums2[j]) { // nums1，nums2 均有数据，继续遍历
                        mid = nums1[i];
                        i++;
                    } else {
                        mid = nums2[j];
                        j++;
                    }
                }
                count += 1;
            }
        }

        return mid;
    }

//    // 递归实现
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int len = nums1.length + nums2.length;
//        if (len % 2 == 1) {
//            return findKth(nums1, 0, nums2, 0, len / 2 + 1);
//        }
//        return (
//                findKth(nums1, 0, nums2, 0, len / 2) + findKth(nums1, 0, nums2, 0, len / 2 + 1)
//        ) / 2.0;
//    }
//
//    public static int findKth(int[] A, int A_start,
//                              int[] B, int B_start,
//                              int k) {
//        if (A_start >= A.length) {
//            return B[B_start + k - 1];
//        }
//        if (B_start >= B.length) {
//            return A[A_start + k - 1];
//        }
//
//        if (k == 1) {
//            return Math.min(A[A_start], B[B_start]);
//        }
//
//        int A_key = A_start + k / 2 - 1 < A.length
//                ? A[A_start + k / 2 - 1]
//                : Integer.MAX_VALUE;
//        int B_key = B_start + k / 2 - 1 < B.length
//                ? B[B_start + k / 2 - 1]
//                : Integer.MAX_VALUE;
//
//        if (A_key < B_key) {
//            return findKth(A, A_start + k / 2, B, B_start, k - k / 2);
//        } else {
//            return findKth(A, A_start, B, B_start + k / 2, k - k / 2);
//        }
//    }
}
