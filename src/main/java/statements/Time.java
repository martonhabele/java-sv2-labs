package statements;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String timeToString() {
        return hour + ":" + minute + ":" + second;
    }

    public boolean earlierThan(Time competitorTime) {
        int currentTimeInSecs = this.getInSeconds();
        int competitorTimeInSecs = competitorTime.getInSeconds();
        return currentTimeInSecs < competitorTimeInSecs;
    }

    public int getInMinutes() {
        return hour * 60 + minute;
    }

    public int getInSeconds() {
        return getInMinutes() * 60 + second;
    }
}
