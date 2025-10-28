package th.ac.kmutt.cpe.algorithm.polwarit.sort;

import java.util.ArrayList;

public class QuickSort<T extends Comparable<T>> implements SortStrategy<T> {
    @Override
    public void sort(ArrayList<T> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        quicksort(list, 0, list.size() - 1);
    }

    private void quicksort(ArrayList<T> list, int left, int right) {
        if (left < right) {
            int s = hoarePartition(list, left, right);
            
            quicksort(list, left, s - 1);
            quicksort(list, s + 1, right);
        }
    }

    private int hoarePartition(ArrayList<T> list, int left, int right) {
        T pivot = list.get(left);
        int i = left;
        int j = right + 1;

        while (true) {
            do {
                i++;
            } while (i <= right && list.get(i).compareTo(pivot) < 0);

            do {
                j--;
            } while (list.get(j).compareTo(pivot) > 0);

            if (i >= j) {
                break;
            }

            swap(list, i, j);
        }

        swap(list, left, j);

        return j;
    }

    private void swap(ArrayList<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
