package th.ac.kmutt.cpe.algorithm.polwarit.Practice2.pseudocode.search;

import java.util.ArrayList;

public class BinarySearch<T extends Comparable<T>> implements SearchStrategy<T> {
    @Override
    public int search(ArrayList<T> list, T target) {
        int l = 0, r = list.size();

        while (l <= r) {
            int m = ( l + r ) / 2;
            if ( target == list.get(m) ) {
                return m;
            }else if ( target.compareTo(list.get(m)) < 0 ) {
                r = m - 1;
            }else {
                l = m + 1;
            }
        }

        return -1;
    }
}