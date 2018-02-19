package lang.math;

/**
 * Костанта ПИ
 */
public class PI {
    public static void main(String[] args) {
        int radius = 10;
        System.out.println("Площадь окружности с радиусом - "+radius+" составляет: "+areaCircle(radius));
        System.out.println("Периметр окружности с радиусом - "+radius+" составляет: "+perimetreCircle(radius));
    }

    private static double perimetreCircle(int radius) {
        return 2*Math.PI*radius;
    }

    private static double areaCircle(int radius) {
        return Math.PI*Math.pow(radius,2);
    }
}
