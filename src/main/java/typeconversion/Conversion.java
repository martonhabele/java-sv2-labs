package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double number) {
        int intNumber = (int) number;
        return intNumber;
    }

    public byte[] convertIntArrayToByteArray(int[] numbers) {
        byte[] byteArray = new byte[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && numbers[i] < 127) {
                byteArray[i] = (byte) numbers[i];
            }
            else {
                byteArray[i] = -1;
            }
        }
        return byteArray;
    }

    public int getFirstDecimal(double number) {
        int wholeNum = (int) number;
        double halfBakedNum = (number - (double) wholeNum) * 10d;
        return (int) halfBakedNum;
    }

}