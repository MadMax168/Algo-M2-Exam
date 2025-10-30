package src.th.ac.kmutt.cpe.algorithm.polwarit.problem;

import java.util.ArrayList;
import java.util.Scanner;

import src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode.Quickselect;

public class P4 {
    public void displayQuickSelect(Scanner scan) {
        System.out.println("Input Form:");
        int n = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        int k = scan.nextInt();
        Quickselect qSelect = new Quickselect();
        System.out.println(qSelect.quickSelect(list, 0, list.size() - 1, k));
    }
}
