package src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode;

import java.util.ArrayList;

public class HoarePartitioning<T extends Comparable<T>> {
    public int hoare( ArrayList<T> list, int left, int right ){
        T pivot = list.get(left);
        int i = left, j = right + 1;
        Swap<T> swap = new Swap<>();

        while (true) {
            do {
                i++;
            } while (list.get(i).compareTo(pivot) >= 0);

            do {
                j--;
            } while (list.get(j).compareTo(pivot) <= 0);
   
            if (i >= j) {
                break;
            }

            swap.swap(list, i, j);
        }

        swap.swap(list, i, j);
        swap.swap(list, left, j);
        return j;
    }
}
