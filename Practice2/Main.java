import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import src.th.ac.kmutt.cpe.algorithm.polwarit.problem.P4;
import src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode.search.BinarySearch;
import src.th.ac.kmutt.cpe.algorithm.polwarit.pseudocode.search.SearchContext;

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
                problemPart(scan);
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
        boolean running = true;
        while (running) {
            System.out.println("Choices : 1.Quick 2.Merge 3.Insertion 4.Heap 5.Distribution 6.Comparison 7.Exit");
            System.out.print("Select choice : ");
            int choice = scan.nextInt();
            System.out.println("Input Form : ");
            switch (choice) {   
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                                  
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    running = false;
                    System.out.println("Exit ...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
                }
        }
    }

    private static void algosPart(Scanner scan) {

    }

    private static void createChoices(String title, ArrayList<String> items) {
        System.out.println("-".repeat(15) + " " + title + " " + "-".repeat(15));
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    private static void problemPart(Scanner scan) {
         ArrayList<String> exercises = new ArrayList<>(Arrays.asList(
            "Did you know that...? (nextPermutation)",
            "Android (generatePermutation)",
            "Pancake Sort",
            "Quick Select (Lomuto Partition)",
            "Merge Sort? (BottomUpMergeSort)",
            "Quick Sort (Hoare's Partition)",
            "2D Closest Pair",
            "Make a Wish",
            "Presorted Uniqueness (PresortElenentUniqueness)",
            "Heap Sort",
            "Lottery",
            "Hash Table"
        ));

        createChoices("EXERCISE CHOICES", exercises);
        System.out.print("Select Choice: ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                
                break;
            case 2:
               
                break;
            case 3:
               
                break;
            case 4:
                P4 qSelect = new P4();
                qSelect.displayQuickSelect(scan);
                break;
            case 5:
               
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 9:
               
                break;
            case 10:
               
                break;
            case 11:
                
                break;
            case 12:
                
                break;
            default:
                System.out.println("Do not have this choice. <(T_T)>");
                break;
        }
    }
}

//Windows : cd "d:\Max\KMUTT\CPE231\M2\src\th\ac\kmutt\cpe\algorithm\polwarit\Practice2\" && javac Main.java && java Main