package Medium;


import java.util.*;

public class HW1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
//        System.out.println(str);

        Set<Character> pat = new HashSet<>();
        Set<Character> pp = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
            if (pp.contains(str[i]))
                pat.add(str[i]);
            else
                pp.add(str[i]);

        }

        LinkedList<Character> res = new LinkedList<>(pat);
        res.sort(Character::compareTo);

        StringBuilder sb = new StringBuilder();
        res.forEach(c -> sb.append(c));

        System.out.println(sb.toString());
    }
}