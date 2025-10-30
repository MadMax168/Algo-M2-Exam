package src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode.sort;

import java.util.ArrayList;

import src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode.HoarePartitioning;

public class QuickSort<T extends Comparable<T>> implements SortStrategy<T> {
    @Override
    public void sort(ArrayList<T> list) {
        if (list.isEmpty()) {
            return;
        }
        quickSort(list, 0, list.size() - 1);
    }

    private void quickSort(ArrayList<T> list, int left, int right) {
        if (left < right) {
            HoarePartitioning<T> partition = new HoarePartitioning<>();
            int s = partition.hoare(list, left, right);
            quickSort(list, left, s - 1);
            quickSort(list, s + 1, right);
        }
    }
}
