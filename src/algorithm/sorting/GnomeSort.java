package algorithm.sorting;

import java.util.Arrays;

public class GnomeSort {
    public static void main(String[] args) {
        int[] array = {7,3,6,2,8,5,1,0,9,4};
        System.out.println(Arrays.toString(gnomeSort(array)));
    }

    private static int[] gnomeSort(int[] array) {
        int i = 1;
        while (i<array.length) {
            if (i==0 || array[i-1] <= array[i]) {
                i++;
            } else {
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                i--;
            }
        }
        return array;
    }

}
