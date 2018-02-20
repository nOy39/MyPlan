package algorithm.sorting;

import java.util.Arrays;

/**
 * Сортировка массива слиянием:
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5,8,3,1,4,0,2,9,7,6};
        System.out.println(Arrays.toString(mergeSort(array)));
    }

    private static int[] mergeSort(int[] array) {
        if (array.length<2) return array;

        int half = array.length/2;
        int [] fArray = Arrays.copyOfRange(array,0,half);
        int[] sArray = Arrays.copyOfRange(array,half,array.length);

        return mergeArrays(mergeSort(fArray), mergeSort(sArray));
    }

    private static int[] mergeArrays(int[] fArray, int[] sArray) {
        int[] resultArray = new int[fArray.length+sArray.length];

        int fIndex = 0, sIndex = 0;

        for (int i=0;i<resultArray.length;i++) {
            if (fIndex == fArray.length) {
                resultArray[i] = sArray[sIndex++];
            } else if (sIndex == sArray.length) {
                resultArray[i] = fArray[fIndex++];
            } else if (fArray[fIndex] < sArray[sIndex]) {
                resultArray[i] = fArray[fIndex++];
            } else {
                resultArray[i] = sArray[sIndex++];
            }
        }
            return resultArray;
        }
    }

