package src.th.ac.kmutt.cpe.algorithm.polwairt.pseudocode.sort;

import java.util.ArrayList;

public interface SortStrategy<T extends Comparable<T>> {
    public void sort(ArrayList<T> list);
}
