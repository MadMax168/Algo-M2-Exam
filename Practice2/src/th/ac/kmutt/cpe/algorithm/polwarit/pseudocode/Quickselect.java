package src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode;

import java.util.ArrayList;

public class Quickselect {
    public int quickSelect(ArrayList<Integer> list, int left, int right, int k) {
        LomutoPartition partition = new LomutoPartition();
        int s = partition.lomuto(list, left, right);

        if ( s == left + k - 1 ) {
            return list.get(s);
        } else if ( s > left + k - 1 ) {
            quickSelect(list, left, s - 1, k);
        } else {
            quickSelect(list, s + 1, right, k - (s - left + 1));
        }

        return -1;
    }
}
