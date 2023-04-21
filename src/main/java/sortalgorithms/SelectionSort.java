package sortalgorithms;

/**Løper gjennom arrayet og flytter alltid det største elementet til siste plass i den usorterte delen. O(n^2) */
public class SelectionSort {
    /*
    * Vi flytter alltid det største elementet i arrayet til siste plass, før vi gjennom arrayet - 1 for hver gang
    ! O(n^2)
    * Krever litt mindre bytting enn bubble-sort
    * Ustabil (hvis vi har to like elementer vil de også bytte plass)
    */

    /** Udemy implementering */
    public static int[] Usort(int[] int_array) {

        for (int lastUnsortedIndex = int_array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (int_array[i] > int_array[largest]) {
                    largest = i;
                }
            }
            swap(int_array, largest, lastUnsortedIndex);
        }

        return int_array;
    }

    // Course-implementation helper method
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /** Min implementering */
    public static int[] sort(int[] int_array) {
        int len = int_array.length;
        int counter = 0;
        while (len > 0) {
            for (int i = 1; i < len; i++) {
                int largest = int_array[i - 1];
                if (int_array[i] > int_array[i - 1]) {
                    largest = int_array[i];
                    counter++;
                }
            }
            len--;
        }
        System.out.print("\n\nSteg for selection sort: " + counter);
        return int_array;
    }
}
