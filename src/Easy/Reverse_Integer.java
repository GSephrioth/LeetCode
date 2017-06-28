package Easy;


/**
 * Created by xuzhuchen on 6/27/17.
 */
public class Reverse_Integer {
    public int reverse(int x) {
        if(x<0){
            String str = Integer.toString(Math.abs(x));
            return 0-Integer.valueOf(new StringBuffer(str).reverse().toString());
        }else{
            String str = Integer.toString(x);
            return Integer.valueOf(new StringBuffer(str).reverse().toString());
        }

    }
    public static void main(String args[]){
        Reverse_Integer RI = new Reverse_Integer();

    }
}
