package Hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * You have k lists of sorted integers in ascending order. Find the smallest range that includes at least one number from each of the k lists.
 *
 * We define the range [a,b] is smaller than range [c,d] if b-a < d-c or a < c if b-a == d-c.
 *
 * Example 1:
 * Input:[[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]
 * Output: [20,24]
 * Explanation:
 * List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
 * List 2: [0, 9, 12, 20], 20 is in range [20,24].
 * List 3: [5, 18, 22, 30], 22 is in range [20,24].
 * Note:
 * The given list may contain duplicates, so ascending order means >= here.
 * 1 <= k <= 3500
 * -105 <= value of elements <= 105.
 * For Java users, please note that the input type has been changed to List<List<Integer>>. And after you reset the code template, you'll see this point.
 *
 * Created by xuzhuchen on 7/12/17.
 */
class Smallest_Range {

    /**
     * solution 1 : form a large hash map contains all numbers and which list it belongs to
     * O(n^2)
     * TLE: Time Limit Exceeded
     */
    private List<Integer> numberList = new ArrayList<>();
    private List<Integer> indexList = new ArrayList<>();
//    int[] smallestRange(List<List<Integer>> nums) {
//        // Empty list
//        if (nums.isEmpty()) return null;
//        // nums with only one list and one number in it
//        if (nums.size() == 1 && nums.get(0).size() == 1) return new int[]{nums.get(0).get(0),nums.get(0).get(0)};
//
//
//        int left, right, smallest = -100000,largest = 100000;
//        List<Integer> sublist,temp;
//        LinkedList<Integer> indexs = new LinkedList<>();
//        for(int i = 0;i< nums.size();i++){
//            add(nums.get(i),i);
//            indexs.add(i);
//        }
//        for (left = 0;left < numberList.size()-1; left++){
//            right = left+1;
//            while(right < numberList.size()){
//                sublist = indexList.subList(left,right+1);
//                temp  = new LinkedList<>(indexs);
//                temp.removeAll(sublist);
//                if (temp.isEmpty() && isSmaller(numberList.get(left),numberList.get(right),smallest,largest)){
//                    smallest = numberList.get(left);
//                    largest = numberList.get(right);
//                }
//                right++;
//            }
//        }
//
//
//        return new int[]{smallest, largest};
//    }
    /**
     * Add list1 to
     * @param list List needs to be added to numberList
     * @param index index of list in "nums"
     * */
    void add(List<Integer> list,int index){
        int i = 0,j = 0;
        for (; i < list.size(); i++) {
            while (j<numberList.size()) {
                if(list.get(i) < numberList.get(j)){
                    break;
                }
                j++;
            }
            numberList.add(j,list.get(i));
            indexList.add(j,index);
            j++;
        }
    }
    boolean isSmaller(int r1start,int r1end,int r2start,int r2end){
        if((r1end-r1start) < (r2end-r2start)) return true;
        else if((r1end-r1start) > (r2end-r2start)) return false;
        else {
            if (r1start < r2start) return true;
            else if (r1start > r2start) return false;
            else return false;
        }
    }

    /**
     *
     * */
    int[] smallestRange(List<List<Integer>> nums){
        int left,right,smallest = 0 ,largest = 0;

        return new int[]{smallest,largest};
    }
}
