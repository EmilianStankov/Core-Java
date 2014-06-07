package corejava.oopintro;

import java.util.ArrayList;

public interface Stack {
    public void push(Object obj);
    
    public void pop();
    
    public void clear();
    
    public int length();
    
    public ArrayList<Object> getElements();
    
    public boolean isEmpty();
}
