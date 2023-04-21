package arrays_and_big_o;

public class ArraysAndBigO {
    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("log2n:");
        // log2n
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Math.log(arr[i] / Math.log(2)) + " ");
        }

        System.out.println("\nn");
        // n
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nnlog2n");
        // nlog2n
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * (Math.log(arr[i] / Math.log(2))) + " ");
        }

        System.out.println("\nn^2");
        // n^2
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * arr[i] + " ");
        }

        ArraysAndBigO ar = new ArraysAndBigO();
        ArraysAndBigO[] arArr = {ar};
        System.out.println("\n" + arArr.length);

        /*
        ARRAYS AS A DATASTRUCTURE
        - One continuous block of memory
        - Each element is the same size
            - What's stored in the variables are object references!
            - ie if its an intArr, each node will be 4 bytes
        - Arrays are really good at retrieveing elements if we know the index
        - The time complexity is constant if we know the index  --  O(1)
        -  The time complexity is linear if we dont know the index -- O(n)
        */

        // Mem adress of intArr ( memAdr + index * elemSize(bytes) )
        int[] arr2 = {20, 35, -15, 7, 55, 1, -22};
        int memAdress = 12;
        int intLenInBytes = 4;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Adress of array[" + i + "]: ");
            System.out.println(memAdress + i * intLenInBytes);
        }
    }
}

