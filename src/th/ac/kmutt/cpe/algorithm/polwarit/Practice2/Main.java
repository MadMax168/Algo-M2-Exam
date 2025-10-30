import java.util.ArrayList;
import java.util.Scanner;

import pseudocode.search.BinarySearch;
import pseudocode.search.SearchContext;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choices : 1.Algorithms 2.Problems");
        System.out.print("Select choice : ");
        switch (scan.nextInt()) {
            case 1:
                algorithmPart(scan);                
                break;
            case 2:

                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    private static void algorithmPart(Scanner scan) {
        boolean running = true;
        while (running) {
            System.out.println("Choices : 1.Search 2.Sort 3.Algos 4.Exit");
            System.out.print("Select choice : ");
            switch (scan.nextInt()) {
                case 1:
                    searchPart(scan);                
                    break;
                case 2:
                    sortPart(scan);
                    break;
                case 3:
                    algosPart(scan);                
                    break;
                case 4:
                    running = false;
                    System.out.println("Exit ...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    private static void searchPart(Scanner scan) {
        System.out.println("Binary Search");
        int n = scan.nextInt(), target = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        
        BinarySearch<Integer> bs = new BinarySearch<>();
        SearchContext<Integer> context = new SearchContext<>(bs);
        int result = context.executeSearch(list, target);

        System.out.println(result);
    }

    private static void sortPart(Scanner scan) {

    }

    private static void algosPart(Scanner scan) {

    }
}

//Windows : cd "d:\Max\KMUTT\CPE231\M2\src\th\ac\kmutt\cpe\algorithm\polwarit\Practice2\" && javac Main.java && java Main