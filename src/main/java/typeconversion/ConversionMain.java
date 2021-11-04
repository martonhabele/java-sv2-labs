package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();

        System.out.println(conversion.convertDoubleToDouble(5.2d));
        int[] numbers = new int[] {5, -14, 6, 2, 125, 354, 9738, 3};
        byte[] numbersToBytes = conversion.convertIntArrayToByteArray(numbers);
        System.out.println(Arrays.toString(numbersToBytes));
        System.out.println(conversion.getFirstDecimal(7.3d));
    }
}