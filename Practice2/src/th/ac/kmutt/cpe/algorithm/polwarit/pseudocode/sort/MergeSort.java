package src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode.sort;

import java.util.ArrayList;

import src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode.Merge;

public class MergeSort<T extends Comparable<T>> implements SortStrategy<T>  {
    @Override
    public void sort(ArrayList<T> list) {
        if (list.isEmpty()) {
            return ;
        }
        mergeSort(list, 0, list.size() - 1);
    }

    private void mergeSort(ArrayList<T> list, int l, int r) {
        int mid = (l + r) /2;
        if ( r > 1 ) {
            ArrayList<T> b = new ArrayList<>();
            for ( int i = l; i < mid; i++ ) {
                b.add(list.get(i));
            }

            ArrayList<T> c = new ArrayList<>();
            for ( int i = mid + 1; i < r; i++ ) {
                c.add(list.get(i));
            }

            mergeSort(b, l, mid);
            mergeSort(c, mid + 1, r);

            Merge<T> m = new Merge<>();
            m.merge(b, c, list); 
        }
    }
}
