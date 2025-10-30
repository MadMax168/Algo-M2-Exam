package src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode;

import java.util.ArrayList;

public class LomutoPartition {
    public int lomuto(ArrayList<Integer> list, int left, int right) {
        Swap<Integer> swap = new Swap<>();
        int p = list.get(left);
        int s = left;


        for ( int i = left; i <= right; i++) {
            if (list.get(i) < p) {
                s = s + 1;
                swap.swap(list, list.get(s), list.get(i));
            }
        }

        swap.swap(list, left, s);
        return s;
    }
}
