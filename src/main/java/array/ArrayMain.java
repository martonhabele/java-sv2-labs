package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(weekDays[1]);
        System.out.println(weekDays.length);

        System.out.print(System.lineSeparator());

        int[] twoPowerset = new int[5];
        twoPowerset[0] = 1;
        for (int i = 1; i < twoPowerset.length; i++) {
            twoPowerset[i] = twoPowerset[i - 1] * 2;
        }

        for (int number: twoPowerset) {
            System.out.print(number + " ");
        }

        System.out.print(System.lineSeparator());

        boolean[] statements = new boolean[6];
        statements[0] = false;
        for (int i = 1; i < statements.length; i++) {
            statements[i] = !statements[i - 1];
        }

        for (boolean statement: statements) {
            System.out.print(statement + " ");
        }
    }
}
