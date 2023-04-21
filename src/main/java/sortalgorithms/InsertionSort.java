package sortalgorithms;

import java.time.LocalTime;

/**
 *Insertion sort er en enkel sorteringsalgoritme hvor elementer fra en liste settes inn én etter én på riktig posisjon i en sortert del av listen.
 *Algoritmen gjentas til alle elementer er satt inn på riktig posisjon i den sorterte delen, og dette resulterer i en fullstendig sortert liste.
 */
public class InsertionSort {
    /*
    * Vi sammenligner i med [0] i arr. Neste runde sjekke vi i med [0] og [1] for
    * så å injisere i på riktig plass i den sorterte delen av arrayet
    *
    * In place algorithm, ingen ekstra arrays for å sortere
    * Stable (ved to like vil de ikke bytte plass)
    ! O(n^2)
    */

    /** Udemy implementering */
    public static int[] Usort(int[] int_array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < int_array.length; firstUnsortedIndex++) {
            int newElement = int_array[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && int_array[i - 1] > newElement; i--) {
                int_array[i] = int_array[i - 1];
            }

            int_array[i] = newElement;
        }
        return int_array;
    }

    /** Min implementering */
    // [6, 22, -1, 4, -5]
    public static int[] sort(int[] int_array) {
        System.out.println("\nSindres insertion sort implementering: ");
        LocalTime startTime = LocalTime.now();
        long count = 0;
        for (int unsorted = 1; unsorted < int_array.length; unsorted++) {
            int current = int_array[unsorted];

            int i;
            for (i = unsorted; i > 0 && int_array[i - 1] > current; i--) {
                int_array[i] = int_array[i - 1];
                count++;
            }
            int_array[i] = current;
        }

        LocalTime endTime = LocalTime.now();
        double elapsed = endTime.toNanoOfDay() - startTime.toNanoOfDay();
        elapsed /= 1000000;
        System.out.println("Tid: " + elapsed + " ms");

        System.out.println("Steg: " + count);
        return int_array;
    }
}
