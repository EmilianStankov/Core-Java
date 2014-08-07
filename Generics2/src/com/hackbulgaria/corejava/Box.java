package com.hackbulgaria.corejava;

import java.util.Arrays;
import java.util.List;

public class Box<T> {
    private T value;
    
    public void set(T t){
        this.value = t;
    }
    
    public T get(){
        return this.value;
    }
    
    public Box(){
        
    }
    
    public Box(T t){
        this.set(t);
    }
    
    public static void main(String[] args){
        Box<Integer> box = new Box<>();
        box.set(3);
        System.out.println(box.get());
        
        Box<String> box2 = new Box<>("this example belongs to Oracle");
        System.out.println(box2.get());
        
        Box<List<String>> box3 = new Box<>(Arrays.asList("asd", "abc", "Batman"));
        for(String s: box3.get()){
            System.out.println(s);
        }
    }
}
