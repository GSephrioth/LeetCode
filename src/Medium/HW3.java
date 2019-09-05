package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class HW3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(" ");
        int[] arr = new int[tmp.length - 1];
        int N = Integer.valueOf( tmp[tmp.length-1] );
        for (int i = 0; i < tmp.length - 1; i++) {
            arr[i] = Integer.valueOf(tmp[i]);
        }
        LinkedList<Integer> dis = new LinkedList<>();
        for (int i = 0; i < arr.length-1; i++) {
            dis.add(arr[i+1] - arr[i]);
        }
        dis.sort(Integer::compareTo);
        for (int i = 0; i < dis.size(); i++) {

        }

    }
}
