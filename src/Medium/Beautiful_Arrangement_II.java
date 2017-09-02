package Medium;

/**
 * Given two integers n and k, you need to construct a list which contains n different positive integers ranging from 1 to n and obeys the following requirement:
 * Suppose this list is [a1, a2, a3, ... , an], then the list [|a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] has exactly k distinct integers.
 *
 * If there are multiple answers, print any of them.
 * The n and k are in the range 1 <= k < n <= 104.
 *
 * Created by xuzhuchen on 8/27/17.
 */
public class Beautiful_Arrangement_II {
    // TLE when n=9999 k=9998
    public int[] constructArray(int n, int k) {
        int[] list = new int[n];
        int i = 0;
        while (i < n-k) {
            list[i] = i++;
        }
        int j=1,temp = list[i];
        while(i < n){
            temp += j;
            list[i] = temp;
            j++;
            i++;
        }
        return list;
    }
    // much faster
    public int[] constructArrayII(int n, int k) {
        int[] res = new int[n];
        for (int i = 0, l = 1, r = n; l <= r; i++)
            res[i] = k > 1 ? (k-- % 2 != 0 ? l++ : r--) : (k % 2 != 0? l++ : r--);
        return res;
    }
}
