package src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode;

import java.util.ArrayList;

public class Swap<T extends Comparable<T>> {
    public void swap(ArrayList<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
