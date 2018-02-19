package lang.math;

import java.util.Arrays;

/**
 *
 * Math.sqrt(double a) квадратный корень из числа a
 */
public class Sqrt {
    public static void main(String[] args) {
        double[] array = new double[11];
        for (int i = 0;i<=10;i++) {
            array[i] = Math.pow(i,2);
        }

        for (int i=0;i<=10;i++){
            System.out.println("√"+(int)array[i]+" = "+(int)Math.sqrt(array[i]));
        }
    }
}
