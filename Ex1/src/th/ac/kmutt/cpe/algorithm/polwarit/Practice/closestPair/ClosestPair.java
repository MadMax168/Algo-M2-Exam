package th.ac.kmutt.cpe.algorithm.polwarit.Practice.closestPair;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClosestPair {
    public double efficientClosestPair(Point[] pts, int left, int right) {
        if (right - left <= 3) {
            return bruteForce(pts, left, right);
        }

        int mid = (left + right) / 2;
        double midX = pts[mid].x;

        double dLeft = efficientClosestPair(pts, left, mid);
        double dRight = efficientClosestPair(pts, mid + 1, right);
        double d = Math.min(dLeft, dRight);

        List<Point> strip = new ArrayList<>();
        for ( int i = left; i <= right; i++ ){
            if ( Math.abs(pts[i].x - midX) < d) {
                strip.add(pts[i]);
            }
        }

        strip.sort(Comparator.comparingDouble(p -> p.y));

        for (int i = 0; i < strip.size(); i++) {
            for (int j = i + 1; j < strip.size() && (strip.get(j).y - strip.get(i).y) < d; j++) {
                d = Math.min(d, dist(strip.get(i), strip.get(j)));
            }
        }

        return d;
    }

    private double bruteForce(Point[] pts, int left, int right) {
        double min = Double.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            for (int j = i + 1; j <= right; j++) {
                min = Math.min(min, dist(pts[i], pts[j]));
            }
        }
        return min;
    }

    private double dist(Point a, Point b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
