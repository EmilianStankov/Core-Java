package corejava.exam1;

public class InvalidLevelException extends RuntimeException {
    /**
     * 
     */
    private static final long serialVersionUID = -1570622918040425754L;

    public InvalidLevelException() {
        super("LEVEL must be an integer bigger than 0!");
    }
}
