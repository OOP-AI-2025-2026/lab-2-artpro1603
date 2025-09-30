package ua.opnu;


public class TimeSpan {

    private static final int MAX_MINUTES = 59;
    private static final int MINUTES_IN_HOUR = 60;

    private int hours;
    private int minutes;

    TimeSpan(int hours, int minutes) {
        if (hours >= 0) {
            this.hours = hours;
        }
        if (minutes >= 0 && minutes <= MAX_MINUTES) {
            this.minutes = minutes;
        }
    }

    int getHours() {
        return hours;
    }

    int getMinutes() {
        return minutes;
    }

    void add(int hours, int minutes) {
        if (hours >= 0 && minutes >= 0 && minutes <= MAX_MINUTES) {
            int totalMinutes = this.minutes + minutes;
            int extraHours = totalMinutes / MINUTES_IN_HOUR;
            this.minutes = totalMinutes % MINUTES_IN_HOUR;
            this.hours += hours + extraHours;
        }
    }

    void addTimeSpan(TimeSpan timespan) {
            add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
        return (double) getTotalMinutes() / MINUTES_IN_HOUR;
    }

    int getTotalMinutes() {
        return hours * MINUTES_IN_HOUR  + minutes;
    }

    void subtract(TimeSpan span) {

        int currentTotal = getTotalMinutes();
        int spanTotal = span.getTotalMinutes();

        if (spanTotal <= currentTotal) {
            int newMinutes = currentTotal - spanTotal;
            this.hours = newMinutes / MINUTES_IN_HOUR;
            this.minutes = newMinutes % MINUTES_IN_HOUR;
        }
    }

    void scale(int factor) {
        if (factor > 0) {
            int newMinutes = getTotalMinutes() * factor;
            this.hours = newMinutes / MINUTES_IN_HOUR;
            this.minutes = newMinutes % MINUTES_IN_HOUR;
        }
    }
}