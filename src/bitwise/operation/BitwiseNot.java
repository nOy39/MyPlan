package bitwise.operation;

/**
 * Побитовый унарный оператор NOT
 */
public class BitwiseNot {
    public static void main(String[] args) {

        System.out.println("Пример работы с типом byte");
        byte byteA = 50;
        byte byteB = (byte)~byteA;
        System.out.println(byteB);

        System.out.println("Пример работы с типом int");
        int intA = 100;
        int intB = ~intA;
        System.out.println(intB);

        System.out.println("Пример работы с типом short");
        short shortA = 350;
        short shortB = (short) ~shortA;
        System.out.println(shortB);

        System.out.println("Пример работы с типом long");
        long longA = 111112222233333L;
        long longB = ~longA;
        System.out.println(longB);
    }
}
