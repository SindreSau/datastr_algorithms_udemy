package sortalgorithms;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(401) - 200; // Generates a random number between -100 and 100
        }

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        int[] arr4 = Arrays.copyOf(arr, arr.length);
        int[] arr5 = Arrays.copyOf(arr, arr.length);
        int[] arr6 = Arrays.copyOf(arr, arr.length);

        int[] tstarr = {23, 10, -3, 14, 15};

        /*//! Bubble sort
        int[] sortedArr = BubbleSort.sort(arr);
        System.out.println("Sindres bubble sort implementering: ");
        for (int i : sortedArr) {
            System.out.print(i + " ");
        }

        //! Selection sort
        int[] sortedArr2 = SelectionSort.sort(arr2);
        System.out.println("\nSindres selection sort implementering: ");
        for (int i : sortedArr2) {
            System.out.print(i + " ");
        }*/


        //! Insertion Sort
        int[] sortedArr3 = InsertionSort.sort(arr3);
        /*for (int i : sortedArr3) {
            System.out.print(i + " ");
        }*/
        System.out.println();


        //! Shell sort
        int[] sortedArr4 = ShellSort.sort(arr4);
        /*for (int i : sortedArr4) {
            System.out.print(i + " ");
        }*/
        System.out.println();

        //! Merge sort
        int[] sortedArr5 = MergeSort.sort(arr5);
        for (int i : sortedArr5) {
            System.out.print(i + " ");
        }
        System.out.println();

        //! Merge sort - udemy
        System.out.println("Merge sort - udemy");
        MergeSort.mergeSort(arr6, 0, arr6.length);
        for (int i : arr6) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
