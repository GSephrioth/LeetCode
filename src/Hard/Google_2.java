package Hard;

/**
 * Google Interview problem:1
 * Created by xuzhuchen on 3/21/18.
 */
public class Google_2 {
    boolean[] RosePlants;
    int numOfDays;

    public int solution(int[] P, int K) {

        numOfDays = P.length;
        RosePlants = new boolean[numOfDays];

        // O(N) set all true
        for (int i = 0; i < numOfDays; i++) {
            RosePlants[i] = true;
        }

        for (int i = numOfDays ; i > 0; i--) {
            RosePlants[P[i] - 1] = false;
//            print();
            if(check(K)) return i - 1;
        }
        return -1;
    }

    // O(N) check size of  groups
    private boolean check(int k){
        int current = 0;
        for (int i = 0; i < numOfDays; i++) {
            if (RosePlants[i]){
                current++;
                if (i+1 >= numOfDays || !RosePlants[i+1]){
                    if (current == k) return true;
                }
            }
            else current = 0;
        }
        return false;
    }

//    private void print(){
//        for (int i = 0; i < numOfDays; i++) {
//            System.out.print(RosePlants[i]?0:1);
//        }
//        System.out.println();
//    }
}
