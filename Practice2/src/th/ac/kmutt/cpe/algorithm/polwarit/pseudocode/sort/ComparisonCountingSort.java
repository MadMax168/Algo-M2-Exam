package src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode.sort;

import java.util.ArrayList;

public class ComparisonCountingSort<T extends Comparable<T>> implements SortStrategy<T> {
    @Override
    public void sort(ArrayList<T> list) {
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            count.add(0);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) < 0) {
                    count.set(j, count.get(j) + 1);
                } else {
                    count.set(i, count.get(i) + 1);
                }
            }
        }
        ArrayList<T> s = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            s.set(count.get(i), list.get(i));
        }

        list.clear();
        list.addAll(s);
    }
}
