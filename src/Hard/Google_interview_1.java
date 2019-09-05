package Hard;

/**
 * Google Interview problem:1
 * Created by xuzhuchen on 3/21/18.
 */
public class Google_interview_1 {
    private int numbers[] = new int[4];
    public String solution(String S) {

        // get all numbers
        char[] tempc = S.toCharArray();

        numbers[0]= tempc[0] - 48;
        numbers[1]= tempc[1] - 48;
        numbers[2]= tempc[3] - 48;
        numbers[3]= tempc[4] - 48;
        // sort numbers small -> large
        int temp;
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                if(numbers[i] > numbers[j]){
                    swap(i,j);
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            if(check()) return numToResult();
            swap(2,3);
            if(check()) return numToResult();
            swap(2,3);
            swap(1,2);
            if(check()) return numToResult();
            swap(2,3);
            if(check()) return numToResult();
            swap(2,3);
            swap(1,2);
            if(check()) return numToResult();
            swap(2,3);
            if(check()) return numToResult();
            swap(0,3);
            swap(1,3);
        }

        return numToResult();
    }

    private boolean check(){
        if(numbers[0] <= 1){
            if (numbers[2] <= 5)
                return true;
        }else if(numbers[0] == 2){
            if (numbers[1] <= 4)
                if (numbers[2] <= 5)
                    return true;
            else return false;
        }
        return false;
    }

    private String numToResult(){
        StringBuilder result = new StringBuilder();
        result.append(numbers[0]);
        result.append(numbers[1]);
        result.append(':');
        result.append(numbers[2]);
        result.append(numbers[3]);
//        System.out.println(result.toString());
        return  result.toString();
    }

    private void swap(int x,int y){
        int temp;
        temp = numbers[x];
        numbers[x]= numbers[y];
        numbers[y] = temp;

    }

//    private void print(){
//        for (int i = 0; i < 4; i++) {
//            System.out.println(numbers[i]);
//        }
//    }
}
