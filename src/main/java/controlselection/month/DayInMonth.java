package controlselection.month;

public class DayInMonth {
    public int daysInMonth (int year, String month) {
        switch (month.toLowerCase()) {
            case "january", "march", "may", "july", "august", "october", "december":
                return 31;
            case "april", "june", "september", "november":
                return 30;
            case "february":
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                }
                else return 28;
            default:
                return 0;
        }
    }
}