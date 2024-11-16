package com.OOPS.Access;

public class A {
    public int a; //can be access anywhere
    private int b; // can only be access inside its own class and use getters and setters method
    protected int c; // can not accessed b 

     public void getter(int b){
        int num = b;
     }

     public int setter(int num){
        return num;

        
     }
}
