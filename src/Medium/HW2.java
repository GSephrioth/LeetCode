package Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HW2 {

    public static void main(String args[]) {
        HashMap<Character,Integer> hm = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            if(br.ready()){
                char[] str = br.readLine().toCharArray();
                boolean newlist = true;
                char tmplist = ' ';
                int count = 1;
                int max = 1;
                for (int i = 0; i < str.length; i++) {
                    if (tmplist != str[i]){
                        newlist = true;
                    }
                    if (newlist){
                        count = 1;
                        newlist = false;
                        tmplist = str[i];
                        if(hm.containsKey(str[i])){
                            max = hm.get(str[i]);
                        } else {
                            hm.put(str[i],1);
                        }
                    } else {
                        count += 1;
                        if (max < count){
                            hm.put(str[i],count);
                            max = count;
                        }
                    }
                }
            }
            br.close();
            int totalmax = 1;
            char totalc = ' ';
            Iterator<Map.Entry<Character,Integer>> s = hm.entrySet().iterator();
            while(s.hasNext()){
                Map.Entry<Character,Integer> e = s.next();
                if (e.getValue() > totalmax && totalc < e.getKey()) {
                    totalc = e.getKey();
                    totalmax = e.getValue();
                }
            }
            for (int i = 0; i <totalmax; i++) {
                System.out.print(totalc);
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


}
