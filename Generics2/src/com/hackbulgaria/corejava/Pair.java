package com.hackbulgaria.corejava;

public class Pair<T, V> {
    private T first;
    private V second;
    
    public void setFirst(T t){
        this.first = t;
    }
    
    public T first(){
        return this.first;
    }
    
    public void setSecond(V v){
        this.second = v;
    }
    
    public V second(){
        return this.second;
    }
    
    public Pair(){
        
    }
    
    public Pair(T t, V v){
        this.setFirst(t);
        this.setSecond(v);
    }
    
    public String toString(){
        return String.format("<%s, %s>", first().toString(), second().toString());
    }
    
    public static void main(String[] args){
        Pair<Integer,String> pair = new Pair<>();
        pair.setFirst(3);
        pair.setSecond("string");

        System.out.println(pair.toString()); //=> <3, "string"> (Implement the to string method as well) 
        System.out.println(pair.first()); //=> 3 (first() here returns an *Integer*, not an *Object*!)
        System.out.println(pair.second()); //=> "string"

        Pair<Integer, String> pair2 = new Pair<>(3, "string");
        System.out.println(pair2.toString()); //=> <3, "string"> 
    }
}
