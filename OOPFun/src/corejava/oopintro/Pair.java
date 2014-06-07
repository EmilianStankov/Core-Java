package corejava.oopintro;

public class Pair {

    private final Object firstElement;
    private final Object secondElement;

    public Pair(Object first, Object second) {
        firstElement = first;
        secondElement = second;
    }

    public Object getFirst() {
        return this.firstElement;
    }

    public Object getSecond() {
        return this.secondElement;
    }
    
    public boolean equals(Pair other){
        return this.getFirst().equals(other.getFirst()) && this.getSecond().equals(other.getSecond());
    }

}
