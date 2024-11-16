package com.OOPS.Inhertience;

import com.OOPS.Access.A;

public class Main {
    public static void main(String[] args){
    // Box box1 = new Box(11,2,3);
    // Boxweight box2 = new Boxweight(12,8,6,4);

    // Box box3 = new Boxweight(36 ,22, 19, 15);
    
    // MultiLevel-Inheritence 
    Boxheight box4 = new Boxheight(12, 23, 43, 45, 21);
    
    System.out.println(box4.l + " " + box4.h + " " + box4.w + " " + box4.weight + " " + box4.height);

    // for access modifiers
        A obj = new A();
        

    }
}
