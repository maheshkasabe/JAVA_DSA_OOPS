package com.OOPS.Access;

public class Main {
    public static void main(String[] args){
        A obj = new A();
        obj.a = 12;
        obj.c = 1;

        System.out.println(obj.a + " " + obj.c + " " + obj.setter(12));
    }
}
