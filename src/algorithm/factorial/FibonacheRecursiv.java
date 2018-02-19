package algorithm.factorial;

/**
 *                #0, #1, #2, #3, #4, #5, #6, #7, #8, #9, #10, #11...
 * Числа фибаначе: 0,  1,  1,  2,  3,  5,  8, 13, 21, 34,  55,  89...
 * f(n) = f(n-1) + f(n-2)
 */
public class FibonacheRecursiv {
    public static void main(String[] args) {
        System.out.println(fibanache(11));
    }

    private static int fibanache(int number) {
        if (number==0) return 0;
        if (number==1) return 1;
        else {
            return fibanache(number-1) + fibanache(number-2);
        }
    }
}
