package sortalgorithms;

/**
 * Sammenligner to og to elementer og bytter plass dersom i er mindre enn i+1. O(n^2)
*/
public class BubbleSort {
    /*
    * Sjekker to og to elementer og bytter plass dersom f.eks. arr[1] er mindre enn arr[0]
    * For hver iterasjon får vi en sortert del og en usortert del:
        * Minke i hver gang så vi ikke løper gjennom mer enn nødvendig
    ? Heter bubble-sort fordi vi kan se for oss at de større elementene "BOBLER SEG TIL TOPPEN"
    * In-place algorithm:
        * Vi trenger ikke lage et nytt array for å gjøre sorteringen. Vi lager kanskje noen ekstra variabler, men det
*         er uavhengig av om vi sorterer 4 eller 1000 elementer
    ! O(n^2)
    * Stabil (hvis vi har to like elementer vil de ikke bytte plass)
*/

    // Course-implementation helper method
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /** Udemy implementering */
    public static int[] Usort(int[] int_array) {
        for (int lastUnsortedIndex = int_array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (int_array[i] > int_array[i + 1]) {
                    swap(int_array, i, i + 1);
                }
            }
        }
        return int_array;
    }

    /** Min implementering */
    public static int[] sort(int[] int_array) {
        int len = int_array.length;
        int counter = 0;
        while (len > 0) {
            for (int i = 1; i < len; i++) {
                if (int_array[i - 1] == int_array[i]) {
                    continue;
                } else {
                    int carry = -1;
                    if (int_array[i - 1] > int_array[i]) {
                        carry = int_array[i - 1];
                        int_array[i - 1] = int_array[i];
                        int_array[i] = carry;
                        counter++;
                    }
                }
            }
            len--;
        }
        System.out.println("Steg for bubblesort: " + counter);
        return int_array;
    }
}
