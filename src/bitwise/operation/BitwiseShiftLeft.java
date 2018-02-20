package bitwise.operation;

/**
 * Побитовый сдвиг влево аналогичен операции умножения на 2
 * Пример: 11101 << 111010
 *          29 << 58
 */
public class BitwiseShiftLeft {
    public static void main(String[] args) {
        System.out.println(shiftLeft(29));
    }

    private static int shiftLeft(int number) {
        int a = 1;
        return number<<a;
    }
}
