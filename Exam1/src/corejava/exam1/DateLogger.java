package corejava.exam1;

import java.util.Calendar;

public class DateLogger extends Logger {
    private int LEVEL;

    DateLogger() {
        LEVEL = 3;
    }

    DateLogger(int level) throws InvalidLevelException {
        try {
            if (level <= 0) {
                throw new InvalidLevelException();
            }
            LEVEL = level;
        } catch (InvalidLevelException e) {
            e.printStackTrace();
        }
    }
    
    public String date() {
        Calendar date = Calendar.getInstance();
        int day = date.get(Calendar.DAY_OF_MONTH);
        int month = date.get(Calendar.MONTH);
        int year = date.get(Calendar.YEAR);
        int currentHour = date.get(Calendar.HOUR_OF_DAY);
        int currentMinute = date.get(Calendar.MINUTE);
        int currentSecond = date.get(Calendar.SECOND);
        return String.format("%02d:%02d:%02d %02d.%02d.%02d", currentHour, currentMinute, currentSecond,
                day, month, year);
    }
    
    @Override
    public void log(int level, String message) throws InvalidLevelException {
        try {
            if (level <= LEVEL && level > 0) {
                System.out.println(date() + level + " => " + message);
            } else if (level <= 0) {
                throw new InvalidLevelException();
            }
        } catch (InvalidLevelException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(String message) {
        int level = 3;
        if (level <= LEVEL) {
            System.out.println("|" + date() + "| " + level + " => " + message);
        }
    }

    public static void main(String[] args) {
        Logger logger = new DateLogger();
        logger.log("My message"); // |22:14:01 14.06.2014| 3 => My message
    }
}
