package th.ac.kmutt.cpe.algorithm.polwarit.makeAWish;

import java.util.ArrayList;

public class MakeAWish {
    private int n;
    private ArrayList<Integer> list;

    public MakeAWish(int n, ArrayList<Integer> list) {
        this.n = n;
        this.list = list;
    }

    public int getN() { return n; }
    public ArrayList<Integer> getList() { return list; }

    public void setN( int n ) { this.n = n; }
    public void setList( ArrayList<Integer> list ) { this.list = list; }

    public int makeAWish() {
        if (list == null || list.isEmpty() || n < 1 || n > list.size()) {
            return -1;
        }
        return knapsack(list, 0, list.size());
    }

    private int knapsack(ArrayList<Integer> list, int left, int right) {
        return -1;
    }
}
