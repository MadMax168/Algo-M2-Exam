package src.th.ac.kmutt.cpe.algorithm.polwairt.pseudocode.sort;

import java.util.ArrayList;

public class SortContext<T extends Comparable<T>> {
    private SortStrategy<T> strategy;

    public SortContext(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void executeSort(ArrayList<T> list) {
        strategy.sort(list);
    }
}
