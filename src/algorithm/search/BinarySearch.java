package algorithm.search;

/**
 * https://prog-cpp.ru/search-binary/
 *
 * Created by
 * @author OGI aka nOy39
 * @version 1.0
 * Бинарный поиск по сортированному массиву.
 *
 * |00||01||02||03||04||05||06||07||08||09|
 * [00][11][22][33][44][55][66][77][88][99]
 *
 * Search: key = '77'
 * 1.
 * 2.loop#1:
 *         -middle search startIndex(0) + endIndex(9) >> 1 (=4)
 *         -[00][11][22][33]<<<[44]>>>[55][66][77][88][99]
 *         -if (array[middle(4)] == key(77) return middle;
 *         -if (key > array[middle(4)] startIndex = middle + 1 (=5)
 *         -else endIndex = middle - 1 (3)
 * 3.loop#2:
 *         -middle search startIndex(5) + endIndex(9) >> 1 (=7)
 *         -[00][11][22][33][44][55][66]<<<[77]>>>[88][99]
 *         if (array[middle(7)] == key(77) return middle;
 *         end loop.
 */

public class BinarySearch {

    public static void main(String[] args) {
        /**
         * Сортированный массив.
         * sortedArray
         */
        int[] sortedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                 11, 12, 23, 24, 25, 26, 27, 34, 45, 66,
                 77, 88, 89, 90,100,120,155,230,456,780};
        int key = 780;  //Искомое значение
        System.out.println("Index searching value is "+searchInArray(key,sortedArray));
    }

    /**
     * Метод searchInArray(int key, int[] sortedArray), совершает бинарный
     * поиск значение в массиве.
     * @param key Искомое значение
     * @param sortedArray Сортированный массив, в котором ведется поиск
     * @return возвращает индекс найденного элемента.
     */
    private static int searchInArray(int key, int[] sortedArray) {
        int size = sortedArray.length;
        int minIndex = 0;               //начальный индекс искомого диапазона
        int highIndex = size-1;         //конечный индекс искомого диапазона

        /**
         * Цикл, работает до тех пор пока начальный индекс меньше или не равен конечный индекс
         */
        while (minIndex<=highIndex) {
            /*находим индекс середины текущего массива*/
            int middleIndex = (minIndex+highIndex)>>1;
            /*сравниваем key с sortedArray[middleIndex]*/
            if (key==sortedArray[middleIndex])
                return middleIndex;
            else if (key > sortedArray[middleIndex])
                minIndex = middleIndex + 1;
            else
                highIndex = middleIndex - 1;
        }
        return -1;
    }
}
