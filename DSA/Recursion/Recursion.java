package com.Recursion;

public class Recursion {
    public static void main(String[] args){
        System.out.println(skipappnotapple("appdaapplema"));
    }

        static String skipappnotapple(String up){
        if(up.isEmpty()){
            return " ";
        }
    
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipappnotapple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipappnotapple(up.substring(1));
        }
    }   

}