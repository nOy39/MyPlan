package algorithm.search;

/**
 * Created by @author OGI aka nOy39
 *
 * @Date 20.02.2018
 * @Time 22:44
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1,4,3,2,6,5,7,8,34,69,15,10,9};
        System.out.println(linearSearch(array, 8));
    }

    private static int linearSearch(int[] array, int key) {
        int i=0;
        while (key != array[i]) {
            if (array[i]==key) break;
            if (i+1>array.length-1) return -1;
            else i++;
        }
        return i;
    }
}
