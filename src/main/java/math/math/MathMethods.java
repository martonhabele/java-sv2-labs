package math.math;

public class MathMethods {
    public static void main(String[] args) {
        System.out.println(Math.max(3, 5));
        System.out.println(Math.min(3, 5));

        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));

        float floatingNumber = 2.71f;
        float anotherFloatingNum = 3.14f;
        System.out.println(Math.round(floatingNumber));
        System.out.println(Math.abs(floatingNumber));

        int a = 2;
        int b = 5;
        System.out.println(Math.negateExact(a));
        System.out.println(Math.addExact(a, b));
        System.out.println(Math.subtractExact(a, b));
        System.out.println(Math.multiplyExact(a, b));

        System.out.println(Math.pow(floatingNumber, anotherFloatingNum));
        System.out.println(Math.nextUp(a));
        System.out.println(Math.nextDown(a));

        System.out.println(Math.random());
    }
}