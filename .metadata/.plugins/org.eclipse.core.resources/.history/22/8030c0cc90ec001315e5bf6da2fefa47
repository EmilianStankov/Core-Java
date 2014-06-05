package corejava.oopintro;

import java.util.Calendar;

public class Time {
    Calendar date = Calendar.getInstance();
    final int day = date.get(Calendar.DAY_OF_MONTH);
    final int month = date.get(Calendar.MONTH);
    final int year = date.get(Calendar.YEAR);
    final int currentHour = date.get(Calendar.HOUR_OF_DAY);
    final int currentMinute = date.get(Calendar.MINUTE);
    final int currentSecond = date.get(Calendar.SECOND);

    public String now() {
        return date.getTime().toString();
    }

    public String toString() {
        return String.format("%d:%d:%d %d.%d.%d", currentHour, currentMinute, currentSecond, day, month, year);
    }
}
