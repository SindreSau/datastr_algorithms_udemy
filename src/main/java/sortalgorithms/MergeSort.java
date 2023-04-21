package sortalgorithms;

import java.time.LocalTime;

public class MergeSort {
    /*
    * Divide and conquer - ikke en in-place algorithm, så bruker mer minne
    * Splitter: Splitter arrayen i to rekursivt til vi får et array med kun 1 element
    * Merger : Sammenligner de to arrayene og legger dem sammen i en midlertidig array
    * Stable algorithm
    ! O(nlogn)
    */

    // Udemy implementering
    public static void mergeSort(int[] input, int start, int end) {
        // sjekker om det er mer enn ett element i arrayen
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    // 3, 4 -- 1, 5, 8
    private static void merge(int[] input, int start, int mid, int end) {
        // mid - 1 er siste i venstre array. mid er første i høyre array. Begge skal være ferdig sortert!
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }


    // Min implementering
    public static int[] sort(int[] a) {
        System.out.println("\nSindres merge sort implementering: ");
        long count = 0;
        LocalTime startTime = LocalTime.now();



        LocalTime endTime = LocalTime.now();
        double elapsed = (endTime.toNanoOfDay() - startTime.toNanoOfDay()) ;
        elapsed /= 1000000;
        System.out.println("Tid: " + elapsed + " ms");
        System.out.println("Steg: " + count);
        return a;
    }

    public static void merge() {

    }
}
