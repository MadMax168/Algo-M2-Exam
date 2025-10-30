package th.ac.kmutt.cpe.algorithm.polwarit.search;

import java.util.ArrayList;

public class LinearSearch<T extends Comparable<T>> implements SearchStrategy<T> {
    @Override
    public int search(ArrayList<T> list, T target) {
        for ( int i = 0; i < list.size(); i++ ) {
            if (list.get(i) == target) return i;
        }
        return -1;
    }
}
