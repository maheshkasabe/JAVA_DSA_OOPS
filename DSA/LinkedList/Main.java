package com.LinkedList;

public class Main {
    public static void main(String[] args){
    CLL list = new CLL();

    // list.insertFirst(3);
    // list.insertFirst(6);
    // list.insertFirst(9);
    // list.insertFirst(12);
    // list.insertFirst(13);
    // list.display();
    // System.out.println();
    // list.display();

    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.delete(4);

    list.display();
    }    
}
