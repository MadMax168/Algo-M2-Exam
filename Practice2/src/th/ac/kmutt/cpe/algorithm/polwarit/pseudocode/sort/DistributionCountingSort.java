package src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode.sort;

import java.util.ArrayList;

public class DistributionCountingSort implements SortStrategy<Integer> {
    private int l;
    private int u;

    public DistributionCountingSort(int l, int u) {
        this.l = l;
        this.u = u;
    }

    public int getL() {return l;}
    public int getU() {return u;}
    
    public void setL(int l) {this.l = l;}
    public void setU(int u) {this.u = u;}

    @Override
    public void sort(ArrayList<Integer> list) {
        if ( l > u ) {
            return ;
        }

        ArrayList<Integer> D = new ArrayList<>();
        ArrayList<Integer> S = new ArrayList<>();
        for ( int j = 0; j < u - 1; j++) {
            D.set(j, 0);
        }
        for ( int i = 0; i < list.size(); i++) {
            D.set(list.get(i) - l, D.get(list.get(i) - l) + 1);
        }
        for ( int j = 0; j < u - 1; j++) {
            D.set(j, D.get(j - 1) + D.get(j));
        }
        for ( int i = list.size(); i >= 0; i-- ) {
            int j = list.get(i) - l;
            S.set(D.get(j) - 1, list.get(i));
            D.set(j, D.get(j) - 1);
        }
        
        list.clear();
        list.addAll(S);
    }
}
