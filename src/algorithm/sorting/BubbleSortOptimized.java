package algorithm.sorting;

import java.util.Arrays;

/**
 *          array    = {4, 1, 7, 3, 0}
 *
 * loop#1.1 = {[1<>4], 7, 3, 0}   loop#3.1 = {[1, 3], 0}
 * loop#1.2 = {1, [4, 7], 3, 0}   loop#3.2 = {1, [0<>3]}
 * loop#1.3 = {1, 4, [3<>7], 0}
 * loop#1.4 = {1, 4, 3, [0<>7]}
 *
 * loop#2.1 = {[1, 4], 3, 0}      loop#4.1 = {[0<>1]}
 * loop#2.2 = {1, [3<>4], 0}
 * loop#2.2 = {1, 3, [0<>4]}
 *
 */

public class BubbleSortOptimized {
    public static void main(String[] args) {
        int[] array = {4, 1, 7, 3, 0, 9, 2, 5, 8, 6};
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 1; i < array.length - j; i++) {
                if (array[i] < array[i - 1]) {
                    int swap = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = swap;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
