package javadoc;

/**
 * This is example of generation documentation.
 * @author OGI aka nOy39
 * @Date 20.02.2018
 * @Time 13:29
 * @version 1.0.0
 */
public class ExampleJavaDoc {

    public static void main(String[] args) {
        firstMethod("first");
        secondMethod("second");
        thirdMethod(10);
    }

    /**
     * The first void of JExampleJavaDoc.
     * @param str value in the first void
     */
    public static void firstMethod(String str) {
        str = "First Method";
        System.out.println(str);
    }

    /**
     * The second void of ExampleJavaDoc.
     * @param str value in the second void
     */
    public static void secondMethod(String str) {
        str = "Second String";
        System.out.println(str);
    }

    /**The third void of ExampleJavaDoc.
     * @deprecated
     * @param a value in the the void
     */
    public static void thirdMethod(int a) {
        a = 50;
        System.out.println(a);
    }
}
