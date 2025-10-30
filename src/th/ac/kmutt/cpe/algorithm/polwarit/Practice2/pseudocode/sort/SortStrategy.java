package th.ac.kmutt.cpe.algorithm.polwarit.Practice2.pseudocode.sort;

import java.util.ArrayList;

public interface SortStrategy<T extends Comparable<T>> {
    public void sort(ArrayList<T> list);
}
