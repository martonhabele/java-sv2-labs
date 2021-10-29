package arrays;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println("Number of days as String: " + arraysMain.numberOfDaysAsString());
        System.out.println();

        System.out.println("Multiplication table: " );
        System.out.println(arraysMain.multiplicationTableAsString(4));
        System.out.println();

        System.out.println("Identical temp values: ");
        System.out.println(arraysMain.sameTempValues(new double[]{1, 2, 3, 4}, new double[]{1, 2, 3, 4}));
        System.out.println(arraysMain.sameTempValues(new double[]{1, 2, 3, 4}, new double[]{5, 6, 7, 8}));
        System.out.println();

        System.out.println(arraysMain.wonLottery(new int[]{1, 2, 3, 4}, new int[]{4, 2, 3, 1}));
    }

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] comparedDay) {
        return Arrays.equals(day, comparedDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] comparedDay) {
        int minimumHour = findMinimum(day.length, comparedDay.length);
        double[] dayRange = Arrays.copyOfRange(day, 0, minimumHour);
        double[] comparedDayRange = Arrays.copyOfRange(comparedDay, 0, minimumHour);
        return Arrays.equals(dayRange, comparedDayRange);
    }

    public int findMinimum(int value1, int value2) {
        return Math.min(value1, value2);
    }

    public boolean wonLottery(int[] guessedNumbers, int[] luckyNumbers) {
        int[] guessedNums = Arrays.copyOf(guessedNumbers, guessedNumbers.length);
        Arrays.sort(guessedNums);
        int[] luckyNums = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        Arrays.sort((luckyNums));

        return Arrays.equals(guessedNums, luckyNums);
    }
}