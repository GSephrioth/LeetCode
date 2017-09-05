package Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a sorted array, two integers k and x, find the k closest elements to x in the array.
 * The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.
 *
 * Example 1:
 * Input: [1,2,3,4,5], k=4, x=3
 * Output: [1,2,3,4]
 *
 * Example 2:
 * Input: [1,2,3,4,5], k=4, x=-1
 * Output: [1,2,3,4]
 *
 * Note:
 * The value k is positive and will always be smaller than the length of the sorted array.
 * Length of the given array is positive and will not exceed 10^4
 * Absolute value of elements in the array and x will not exceed 10^4
 *
 * Created by xuzhuchen on 9/5/17.
 */
class Find_K_Closest_Elements {
    // works but not so fast
    List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
        LinkedList<Integer> res = new LinkedList<>();
        int i = 0; // location of x;
        if(arr.contains(x)){
            res.add(x);
            i = arr.indexOf(x);
        } else {
            if (arr.get(0) > x) arr.add(0,x);
            else if (arr.get(arr.size()-1) < x){
                arr.add(x);
                i = arr.size()-1;
            }
            else {
                for (i = 0; i < arr.size() - 1; i++) {
                    if (arr.get(i) < x && arr.get(i+1) > x) {
                        arr.add(i+1,x);
                        i++;
                        break;
                    }
                }
            }

        }
        int a = i-1,b = i+1;
        while (res.size() < k && (a >= 0 || b < arr.size())){
            int lo,hi;
            lo = a >= 0 ? arr.get(a): 40001;
            hi = b < arr.size() ? arr.get(b): 40001;
            if (Math.abs(x-lo) <= Math.abs(x-hi)){
                res.addFirst(lo);
                a--;
            }else{
                res.addLast(hi);
                b++;
            }
        }

        return res;
    }

    // Best answer
    List<Integer> findClosestElements2(List<Integer> arr, int k, int x) {
        int l=0,r=arr.size()-k,m;
        while(l<r){
            m=(l+r)/2;
            if(x-arr.get(m)>arr.get(m+k)-x) l=m+1;
            else r=m;
        }
        return arr.subList(l,l+k);
    }
}
