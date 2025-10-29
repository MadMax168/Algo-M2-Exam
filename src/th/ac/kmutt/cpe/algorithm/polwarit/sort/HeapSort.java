package th.ac.kmutt.cpe.algorithm.polwarit.sort;

import java.util.ArrayList;
import java.util.Collections;

public class HeapSort<T extends Comparable<T>> implements SortStrategy<T>{
    @Override
    public void sort(ArrayList<T> list) {
        int n = list.size();

        for (int i = n - 1; i > 0; i--) {
            Collections.swap(list, 0, i);
            heapify(list, i, 0);
        }

        System.out.println(list);

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }

        System.out.println(list);
    } //MaxHeapBottomUp

    private void heapify(ArrayList<T> list, int n, int i) {
        int k = i;
        T v = list.get(k);
        boolean heap = false;

        while (!heap && 2 * k + 1 < n) {
            int j = 2 * k + 1;
            if (j + 1 < n) {
                if (list.get(j).compareTo(list.get(j + 1)) < 0) {
                    j = j + 1;
                }
            }

            if (v.compareTo(list.get(j)) >= 0) {
                heap = true;
            } else {
                list.set(k, list.get(j));
                k = j;
            }
        }

        list.set(k, v);
    }
}
