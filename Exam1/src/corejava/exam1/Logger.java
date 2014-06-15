package corejava.exam1;

public class Logger {
    protected int LEVEL;

    Logger() {
        this.LEVEL = 3;
    }

    Logger(int level) throws InvalidLevelException {
        try {
            if (level <= 0) {
                throw new InvalidLevelException();
            }
            this.LEVEL = level;
        } catch (InvalidLevelException e) {
            e.printStackTrace();
        }
    }

    public void setLevel(int newLevel) throws InvalidLevelException {
        this.LEVEL = newLevel;
    }

    public void log(int level, String message) throws InvalidLevelException {
        try {
            if (level <= LEVEL && level > 0) {
                System.out.println(String.format("%d => %s", level, message));
            } else if (level <= 0) {
                throw new InvalidLevelException();
            }
        } catch (InvalidLevelException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        int level = 3;
        if (level <= LEVEL) {
            System.out.println(String.format("%d => %s", level, message));
        }
    }

    public static void main(String[] args) {
        Logger logger = new Logger(3); // set LEVEL to 3
        Logger invalidLogger = new Logger(-1); // throws exception
        invalidLogger.log(-1, "duh"); // wont be logged

        logger.log(2, "Somewhat important message"); // gets logged as
                                                     // "2 => Somewhat important message"
        logger.log(3, "Less important message"); // also gets logged!
        logger.log(5, "Not important"); // this is less important than LEVEL, so
                                        // it will not be logged.
        logger.log("Meh"); // overload without a LEVEL parameter, 3 is default.

        logger.setLevel(2); // set Level to 2
        logger.log("My message"); // does not get printed!
        logger.log(Integer.MIN_VALUE, "THIS is most important message in the world!!!"); // throws
                                                                                         // exception
    }
}
