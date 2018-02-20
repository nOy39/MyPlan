package bitwise.operation;

/**
 * Сдвиг вправо аналогичен операции деления на 2.(при сдвиге нечетного числа, остаток от деления отбрасывается)
 * пример 101010(42) >> 10101(21)
 *        10101(21) >> 1010(10)
 */
public class BitwiseShiftRight {
    public static void main(String[] args) {
        System.out.println(shiftRight(35));
    }

    private static int shiftRight(int number) {
        int a = 1;
        return number>>a;
    }
}
