package src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode.sort;

import java.util.ArrayList;

public class InsertionSort<T extends Comparable<T>> implements SortStrategy<T> {
    @Override
    public void sort(ArrayList<T> list) {
        for ( int i = 1; i < list.size(); i++ ) {
            T v = list.get(i);
            int j = i - 1;
            while ( j >= 0 && list.get(j).compareTo(v) > 0 ){
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, v);
        }
    }
}
