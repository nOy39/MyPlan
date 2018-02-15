package algorithm.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {9, 4, 2, 8, 5, 1, 0, 7, 6, 3};

        for (int j = 1; j < array.length;j++) {
            System.out.print("Before loop "+j+": ");
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
                int swap;
                if (array[i] > array[j]) {
                    swap = array[j];
                    array[j] = array[i];
                    array[i] = swap;
                }
            }

        }
        System.out.println("After  loop 9: "+Arrays.toString(array));

    }

}
