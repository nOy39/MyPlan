package algorithm.factorial;

public class FactorialLoop {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    private static int factorial(int number) {
        int ret=1;
        for (int i=1;i<=number;i++) {
            ret*=i;
        }
        return ret;
    }
}
