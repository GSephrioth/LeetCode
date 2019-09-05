package Hard;

import java.util.*;

/**
 * Created by xuzhuchen on 3/21/18.
 */
public class Google_practice {
    public String solution(String S, int K) {
        StringBuilder result = new StringBuilder();
        String upper, full = "";
        String[] noDashes;
        int totalLength = 0;
        int first;
        int size;

        upper = S.toUpperCase(Locale.ENGLISH);
        noDashes = upper.split("-");
        for (int i = 0; i < noDashes.length; i++) {
            totalLength +=noDashes[i].length();
            full += noDashes[i];
        }

        first = totalLength % K;
        System.out.println(first);
        size = totalLength / K;
        System.out.println(size);

        String[] page = new String[size];
        page[0] = full.substring(0,first);
        full = full.substring(first);
        for (int i = 1; i < size; i++) {
            page[i] = full.substring(i*K,(i*K)-1);
        }

        for (int i = 0; i < size; i++) {
            result.append(page[i]);
            if(i != size-1 && result.length() != 0)
            result.append('-');
        }

        return result.toString();
    }
}
