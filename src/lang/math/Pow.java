package lang.math;

/**
 * Возведение в степень.
 * Math.pow(ЧИСЛО,СТЕПЕНЬ);
 */
public class Pow {

    public static void main(String[] args) {
        int number = 5;
        for (int i=0; i<=10; i++) {
            System.out.println(number+"^"+i+" = "+Math.pow(number,i));
        }
    }
}
