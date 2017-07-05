package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return 1 - n in lexicographical order.
 *
 * For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].
 *
 * Please optimize your algorithm to use less time and space. The input size may be as large as 5,000,000.
 * Created by xuzhuchen on 7/3/17.
 */
class Lexicographical_Numbers {
    // 可以实现，但是太慢了
//    public List<Integer> lexicalOrder(int n) {
//        List<Integer> listI = new ArrayList<>();
//        List<String> listS = new ArrayList<>();
//        for(int i = 1 ;i<=n;i++){
//            listS.add(Integer.toString(i));
//        }
//        listS.sort(String::compareTo);
//        listS.forEach(str -> listI.add(Integer.valueOf(str)));
//        return listI;
//    }

//    // 对于10000以上还是太慢
//    List<Integer> lexicalOrder(int n) {
//
//        List<Integer> result = new ArrayList<>();
//
//        List<MyInt> listI = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            listI.add(new MyInt(i));
//        }
//        listI.sort(MyInt::compareTo);
//        listI.forEach(mi -> result.add(mi.getIntegers()));
//        return result;
//    }

    // 寻找下一个可能的数 34 -> 340,35,4 ?
    List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>(n);
        int curr = 1; // 当前数
        for (int i = 1; i <= n; i++) {
            list.add(curr);
            if (curr * 10 <= n) { // 340<=n => 34 -> 340
                curr *= 10;
            } else if (curr % 10 != 9 && curr + 1 <= n) { // 340>n && 35<=n => 34 -> 35
                curr++;
            } else {  // 35>n => 34 -> 4
                while ((curr / 10) % 10 == 9) {
                    curr /= 10;
                }
                curr = curr / 10 + 1;
            }
        }
        return list;
    }

}

class MyInt implements Comparable<MyInt> {
    private int integers[];

    MyInt(int x) {
        ArrayList<Integer> al = new ArrayList<>();
        while (x > 0) {
            al.add(x % 10);
            x /= 10;
        }
        integers = new int[al.size()];
        for (int i = 0; i < integers.length; i++) {
            integers[integers.length - 1 - i] = al.get(i);
        }
    }

    int getIntegers() {
        int x = 0;
        for (int i : integers) {
            x += i;
            x *= 10;
        }
        x /= 10;
        return x;
    }

    @Override
    public int compareTo(MyInt o) {

//         //本数长度短，较小，返回-1
//        if(integers.length < len)
//            return -1;
//        // 本数长度长，较大，返回-1
//        else if (integers.length > len)
//            return 1;
//         //两数长度相同，逐个数字比较大小
//        else{
//            for (int i = 0; i < len; i++) {
//                if(integers[i] > o.integers[i]){
//                    return 1;
//                }else if(integers[i] < o.integers[i]){
//                    return -1;
//                }
//            }
//        }

        // 此题比较字典大小，每一位的数字大小优先于，总数字长度
        int len, flag;
        if (integers.length < o.integers.length) {
            len = integers.length;
            flag = -1;
        } else if (o.integers.length == integers.length) {
            len = integers.length;
            flag = 0;
        } else {
            len = o.integers.length;
            flag = 1;
        }

        for (int i = 0; i < len; i++) {
            if (integers[i] > o.integers[i]) {
                return 1;
            } else if (integers[i] < o.integers[i]) {
                return -1;
            }
        }

        return flag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Integer i : integers) {
            sb.append(i.toString());
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {

        return super.hashCode();
    }
}


