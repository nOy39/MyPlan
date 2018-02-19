package algorithm.factorial;

/**
 * Числа фибаначе: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
 * f(n) = f(n-1) + f(n-2)
 */

public class FibonacheLoop {
    public static void main(String[] args) {
        fibanache(12);
    }

    private static void fibanache(int number) {
            int n0 = 0;
            int n1 = 1;
            int n2;
            System.out.print(n0+" "+n1+" ");
            for(int i = 3; i <= number; i++){
                n2=n0+n1;
                System.out.print(n2+" ");
                n0=n1;
                n1=n2;
            }
            System.out.println();
        }
    }

