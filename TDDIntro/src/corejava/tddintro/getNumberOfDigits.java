package corejava.tddintro;

public class getNumberOfDigits {
    public int getNumOfDigits(int a) {
        String numString = new Integer(a).toString();
        return numString.length();
    }

}
