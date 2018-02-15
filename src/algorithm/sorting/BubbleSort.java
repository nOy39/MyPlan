package algorithm.sorting;

import java.util.Arrays;

/**
 *          array    = {4, 1, 7, 3, 0}
 *
 * loop#1.1 = {[1<>4], 7, 3, 0}   loop#3.1 = {[1, 3], 0, 4, 7}
 * loop#1.2 = {1, [4, 7], 3, 0}   loop#3.2 = {1, [0<>3], 4, 7}
 * loop#1.3 = {1, 4, [3<>7], 0}   loop#3.3 = {1, 0, [3, 4], 7}
 * loop#1.4 = {1, 4, 3, [0<>7]}   loop#3.4 = {1, 0, 3, [4, 7]}
 *
 * loop#2.1 = {[1, 4], 3, 0, 7}   loop#4.1 = {[0<>1], 3, 4, 7}
 * loop#2.2 = {1, [3<>4], 0, 7}   loop#4.1 = {0, [1, 3], 4, 7}
 * loop#2.2 = {1, 3, [0<>4], 7}   loop#4.1 = {0, 1, [3, 4], 7}
 * loop#2.3 = {1, 3, 0, [4, 7]}   loop#4.1 = {0, 1, 3, [4, 7]}
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4, 1, 7, 3, 0, 9, 2, 5, 8, 6};
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array.length ; j++) {
                if (array[j] < array[j - 1]) {
                    int swap = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
