package th.ac.kmutt.cpe.algorithm.polwarit.Practice.makeAWish;

import java.util.ArrayList;

public class MakeAWish {
    private ArrayList<Integer> list;

    public MakeAWish(int n, ArrayList<Integer> list) {
        this.list = list;
    }

    public ArrayList<Integer> getList() { return list; }

    public void setList( ArrayList<Integer> list ) { this.list = list; }

    public int makeAWish() {
        if (list == null || list.isEmpty())
            return 0;
        return seperate(list, 0, list.size() - 1);
    }

    private int seperate(ArrayList<Integer> list, int l, int r) {
        if (l == r) {
            return list.get(l);
        }
        int m = (l + r) >>> 1;

        int lBest = seperate(list, l, m);
        int rBest = seperate(list, m + 1, r);

        int sum = 0, bestLeftSuffix = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum += list.get(i);
            if (sum > bestLeftSuffix) {
                bestLeftSuffix = sum;
            }
        }

        sum = 0;
        int bestRightPrefix = Integer.MIN_VALUE;
        for (int i = m + 1; i <= r; i++) {
            sum += list.get(i);
            if (sum > bestRightPrefix) {
                bestRightPrefix = sum;
            }
        }

        int cross = bestLeftSuffix + bestRightPrefix;
        return Math.max(Math.max(lBest, rBest), cross);
    }
}
