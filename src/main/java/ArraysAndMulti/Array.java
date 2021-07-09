package ArraysAndMulti;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 1d array
        int[] sample = new int[10];
        sample[0] = 100;
        System.out.println(Arrays.toString(sample));

        System.out.println("----------");

        int[] unsortedArray = {4, 1, 3, 6, 9, 0};
        int[] arr = Sort.bubbleSort(unsortedArray);
        System.out.printf("Unsorted Array = %s%n", Arrays.toString(unsortedArray));
        System.out.printf("Sorted Array = %s%n", Arrays.toString(arr));
    }
}
