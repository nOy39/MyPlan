package algorithm.sorting;

import java.util.Arrays;

/**
 *   Запоминает индекс самого маленького значения[n] сравнивает его со значением[0] и меняет их местами.
 *   следующий цикл начинает поиск с последующего индекса предыдущей вставки правильного значения.
 */
public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {9, 4, 2, 8, 5, 1, 0, 7, 6, 3};

        for (int min=0;min<arr.length-1;min++) {
            int least = min;
            System.out.println(Arrays.toString(arr));
            for (int j=min+1;j<arr.length;j++) {
                if(arr[j] < arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }


}
