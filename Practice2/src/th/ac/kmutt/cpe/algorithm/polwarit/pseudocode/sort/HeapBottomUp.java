package src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode.sort;

import java.util.ArrayList;

public class HeapBottomUp<T extends Comparable<T>> implements SortStrategy<T> {
    @Override
    public void sort(ArrayList<T> list) {
        for ( int i = list.size()/2; i > 0; i--) {
            int k = i;
            T v = list.get(k);
            boolean heap = false;

            while (!heap && 2 * k <= list.size()) {
                int j = 2 * k;
                if ( j < list.size() ) {
                    if ( list.get(j).compareTo(list.get(j + 1)) < 0 ) {
                        j = j + 1;
                    }
                }
                if ( v.compareTo(list.get(j)) >= 0 ) {
                    heap = true;
                } else {
                    list.set(k, list.get(j));
                    k = j;
                }
            }
            list.set(k, v);
        }
    }
}
