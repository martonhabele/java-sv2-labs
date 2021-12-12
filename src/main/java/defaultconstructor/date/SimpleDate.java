package defaultconstructor.date;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Not a valid date!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private boolean isValidDate(int year, int month, int day) {
        if (year <= 1900)  {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int monthLength = calculateMonthLength(year, month);
        if (day < 1 || day > monthLength) {
            return false;
        }
        return true;
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private int calculateMonthLength(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                if (isLeapYear(year)) {
                    return 29;
                }
                else {
                    return 28;
                }
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}