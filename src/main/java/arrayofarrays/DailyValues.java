package arrayofarrays;

public class DailyValues {
    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        dailyValues.getValues();
    }

    public void printArrayCollection(int[][] measuredValues) {
        for (int i[]: measuredValues) {
            for (int j: i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void getValues() {
        int[] calendarDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[][] measuredValues = new int[12][];

        for (int i = 0; i < calendarDays.length; i++) {
            measuredValues[i] = new int[calendarDays[i]];
        }
        printArrayCollection(measuredValues);
    }
}