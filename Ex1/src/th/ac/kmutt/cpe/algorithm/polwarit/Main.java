package th.ac.kmutt.cpe.algorithm.polwarit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import th.ac.kmutt.cpe.algorithm.polwarit.Practice.quickselect.QuickSelect;
import th.ac.kmutt.cpe.algorithm.polwarit.Practice.android.Android;
import th.ac.kmutt.cpe.algorithm.polwarit.Practice.closestPair.ClosestPair;
import th.ac.kmutt.cpe.algorithm.polwarit.Practice.closestPair.Point;
import th.ac.kmutt.cpe.algorithm.polwarit.Practice.hashTable.HashTable;
import th.ac.kmutt.cpe.algorithm.polwarit.Practice.lottery.Lottery;
import th.ac.kmutt.cpe.algorithm.polwarit.Practice.makeAWish.MakeAWish;
import th.ac.kmutt.cpe.algorithm.polwarit.Practice.nextPermutation.NextPerm;
import th.ac.kmutt.cpe.algorithm.polwarit.sort.BottomUpMergeSort;
import th.ac.kmutt.cpe.algorithm.polwarit.sort.HeapSort;
import th.ac.kmutt.cpe.algorithm.polwarit.sort.PancakeSort;
import th.ac.kmutt.cpe.algorithm.polwarit.sort.PresortElenentUniqueness;
import th.ac.kmutt.cpe.algorithm.polwarit.sort.QuickSort;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("||            EXAMINATION EXERCISE                ||");
        System.out.println("====================================================");
        displayExChoices(scan);

        scan.close();
    }
    //Done
    private static void displayNextPerm(Scanner scan) {
        ArrayList<Integer> testcase = new ArrayList<>();
        System.out.print("Amount of numbers: ");
        int arrSize = scan.nextInt();
        System.out.println("-".repeat(15));
        System.out.println("Input number: ");
        for (int i = 0; i < arrSize; i++) {
            testcase.add(scan.nextInt());
        }
        System.out.println("-".repeat(15));
    
        NextPerm<Integer> np = new NextPerm<>(testcase);
        System.out.println("Current: " + np.getList());
        np.nextPermutation();
        System.out.println("Next:    " + np.getList());
    }
    //Done
    private static void displayAndroid(Scanner scan) {
        System.out.println("Fill Testcase");
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.nextLine();
        Android android = new Android(n, m);
    
        String[] passwords = new String[m];
        
        for (int i = 0; i < m; i++) {
            passwords[i] = scan.nextLine();
        }

        for (int i = 0; i < m; i++) {
            long result = android.generatePerm(passwords[i]);
            System.out.println(result);
        }
    }
    //Done
    private static void displayPancake(Scanner scan) {
        System.out.println("Fill Testcase");
        int n = scan.nextInt();
        scan.nextLine();
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        PancakeSort<Integer> pkSort = new PancakeSort<>();
        pkSort.sort(list);
        System.out.println(list);        
    }
    //Done
    private static void displayQuickSelect(Scanner scan) {
        System.out.println("Fill Testcase");
        int n = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        int k = scan.nextInt();

        QuickSelect qkSelect = new QuickSelect(n, list, k);
        int result = qkSelect.quickSelect();
        System.out.println(result);
    }
    //Done
    private static void displayMergeSort(Scanner scan) {
        System.out.println("Fill Testcase");
        int n = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        BottomUpMergeSort<Integer> buMergeSort = new BottomUpMergeSort<>();
        buMergeSort.sort(list);
        System.out.println(list);
    }
    //Done
    private static void displayQuickSort(Scanner scan) {
        System.out.println("Fill Testcase");
        int n = scan.nextInt();
        scan.nextLine();

        ArrayList<Integer> testcase = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            testcase.add(scan.nextInt());
        }

        QuickSort<Integer> quickSort = new QuickSort<>();
        quickSort.sort(testcase);
        System.out.println(testcase);
    }
    //Done
    private static void display2D(Scanner scan) {
        System.out.println("Fill Testcase");
        int n = scan.nextInt();
        scan.nextLine();

        Point[] pt = new Point[n];

        for (int i = 0; i < n; i++) {
            pt[i] = new Point(scan.nextDouble(), scan.nextDouble());
        }

        Arrays.sort(pt, Comparator.comparingDouble(p -> p.x));
        ClosestPair closest = new ClosestPair();
        double minDist = closest.efficientClosestPair(pt, 0, n - 1);
        System.out.printf("%.3f\n", minDist);
    }
    //Done
    private static void displayMakeAWish(Scanner scan) {
        System.out.println("Fill Testcase");
        int n = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        MakeAWish wish = new MakeAWish(n, list);
        int result = wish.makeAWish();
        System.out.println(result);
    }
    //Done
    private static void displayPresorted(Scanner scan) {
        System.out.println("Fill Testcase");
        int n = scan.nextInt();
        scan.nextLine();
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        PresortElenentUniqueness<Integer> preSort = new PresortElenentUniqueness<>();
        preSort.sort(list);
        System.out.println(list);
    }
    //Done
    private static void displayHeapSort(Scanner scan) {
        System.out.println("Fill Testcase");
        int n = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        HeapSort<Integer> hs = new HeapSort<>();
        hs.sort(list);
    }
    //Done
    private static void displayLottery(Scanner scan) {
        System.out.println("Fill Testcase");
        int m = scan.nextInt();
        int n = scan.nextInt();
        scan.nextLine();

        String text = scan.nextLine().trim();
        String pattern = scan.nextLine().trim();

        if (text.length() != m || pattern.length() != n || m < n) {
            System.out.println("Invalid size of string");
            return;
        }

        Lottery lottery = new Lottery(text, pattern);
        String result = lottery.horspoolMatching();
        System.out.println(result);
    }
    //Done
    private static void displayHashTable(Scanner scan) {
        System.out.println("Fill Testcase");
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.nextLine();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(scan.nextLine());
        }

        HashTable hTable = new HashTable(list);
        System.out.println(hTable.hashTable(n));
    }

    private static void createChoices(String title, ArrayList<String> items) {
        System.out.println("-".repeat(15) + " " + title + " " + "-".repeat(15));
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    private static void displayExChoices(Scanner scan) {
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
                displayNextPerm(scan);
                break;
            case 2:
                displayAndroid(scan);
                break;
            case 3:
                displayPancake(scan);
                break;
            case 4:
                displayQuickSelect(scan);
                break;
            case 5:
                displayMergeSort(scan);
                break;
            case 6:
                displayQuickSort(scan);
                break;
            case 7:
                display2D(scan);
                break;
            case 8:
                displayMakeAWish(scan);
                break;
            case 9:
                displayPresorted(scan);
                break;
            case 10:
                displayHeapSort(scan);
                break;
            case 11:
                displayLottery(scan);
                break;
            case 12:
                displayHashTable(scan);
                break;
            default:
                System.out.println("Do not have this choice. <(T_T)>");
                break;
        }
    }
}

//Window    : javac -d bin -sourcepath src .\src\th\ac\kmutt\cpe\algorithm\polwarit\*.java && java -cp bin th.ac.kmutt.cpe.algorithm.polwarit.Main
//MacOS     : javac -d bin -sourcepath src $(find src -name "*.java") && java -cp bin th.ac.kmutt.cpe.algorithm.polwarit.Main