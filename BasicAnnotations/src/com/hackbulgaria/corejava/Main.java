package com.hackbulgaria.corejava;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        for(Annotation a : example.getClass().getAnnotations()){
            System.out.println(a.toString());
        }
        System.out.println(example.getClass().getAnnotation(ClassInfo.class));
    }
}
