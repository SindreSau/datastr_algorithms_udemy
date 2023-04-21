package sortalgorithms;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Timer;

/**
 * Shell sort er en algoritme som starter med å dele listen opp i mindre deler og sortere disse delene med en enkel
 * sorteringsalgoritme som f.eks. Insertion sort. Deretter kombineres disse delene gradvis ved å redusere størrelsen på
 * intervallene mellom elementene som sammenlignes og byttes, inntil hele listen er sortert.
 */
public class ShellSort {
    /*
    * In place algorithm
    * Unstable (To like verdier vil bytte plass)
    ! WORST CASE: O(n^2)  --  Men kan gjøre det mye bedre avhengig av gap!
    */

    // Udemy implementering
    public static int[] Usort(int[] intArr) {
        System.out.println("\nUdemy shell sort implementering: ");
        LocalTime startTime = LocalTime.now();
        long count = 0;

        for (int gap = intArr.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArr.length; i++) {
                int newElement = intArr[i];
                int j = i;

                while (j >= gap && intArr[j - gap] > newElement) {
                    intArr[j] = intArr[j - gap];
                    count++;
                    j -= gap;
                }

                intArr[j] = newElement;
            }
        }

        LocalTime endTime = LocalTime.now();
        double elapsed = endTime.toNanoOfDay() - startTime.toNanoOfDay();
        elapsed = elapsed / 1000000;
        System.out.println("Tid: " + elapsed + " ms");

        System.out.println("Steg: " + count);
        return intArr;
    }

    // Min implementering fikset
    /*
     *[23, 10, -3, 14, 15]
     *[-3, 10, 23, 14, 15]
     *[-3, 10, 15, 14, 23]
     *[-3, 10, 14, 15, 23]
    */
    public static int[] sort(int[] intArr) {
        System.out.println("\nSindres shell sort implementering: ");
        long count = 0;
        LocalTime startTime = LocalTime.now();

        // Ytre: løper -3 -> 14 -> 15
        for (int gap = intArr.length / 2; gap > 0; gap /= 2) {
            // Midtre: løper -3 -> 14 -> 15 -> 3 første gang, men 10 -> -3 -> 14 osv andre runde
            for (int i = gap; i < intArr.length; i++) {
                int current = intArr[i];
                int j = i;
                // Indre: mest relevant for insertion-biten: sjekker 14 mot 15, bytter, og sjekker så 14 mot 10 osv
                while (j >= gap && intArr[j - gap] > current) {
                    intArr[j] = intArr[j - gap];
                    count++;
                    j -= gap;
                }
                intArr[j] = current;
            }
        }

        LocalTime endTime = LocalTime.now();
        double elapsed = (endTime.toNanoOfDay() - startTime.toNanoOfDay()) ;
        elapsed /= 1000000;
        System.out.println("Tid: " + elapsed + " ms");
        System.out.println("Steg: " + count);
        return intArr;
    }

    // Min feile implementering
    /*public static int[] sort(int[] intArr) {
        System.out.println("\nSindres shell sort implementering: ");
        LocalTime startTime = LocalTime.now();
        int gap = intArr.length / 2;
        long count = 0;

        while (gap > 0) {
            if (gap == 1) {
                for (int unsorted = 1; unsorted < intArr.length; unsorted++) {
                    int current = intArr[unsorted];

                    int i;
                    for (i = unsorted; i > 0 && intArr[i - 1] > current; i--) {
                        intArr[i] = intArr[i - 1];
                        count++;
                    }
                    intArr[i] = current;
                }
            }
            for (int i = gap; i < intArr.length; i++) {
                int current = intArr[i];
                if (intArr[i] < intArr[i - gap]) {
                    intArr[i] = intArr[i - gap];
                    intArr[i - gap] = current;
                    count++;
                }
            }
            gap = gap / 2;
        }

        LocalTime endTime = LocalTime.now();
        double elapsed = endTime.toNanoOfDay() - startTime.toNanoOfDay();
        elapsed = elapsed / 1000000;
        System.out.println("Tid: " + elapsed + " ms");

        System.out.println("Steg: " + count);
        return intArr;
    }*/
}
