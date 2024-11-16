package com.Recursion;

public class Permutaions {
    public static void main(String[] args){
        // System.out.println(count(3,3));
        // path("", 3, 3);
        diagonal("", 3, 3);
    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;
    }

    static void path(String p, int r , int c){
        if(r==1 || c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+"D", r-1,c);
        }
        if(c>1){
            path(p+"R", r, c-1);
        }
    }

    static void diagonal(String p, int r , int c){
        if(r==1 || c==1 ){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1){
            diagonal(p+"D", r-1, c-1);
        }
        if(r>1){
            diagonal(p+"V", r-1, c);
        }
        if(c>1){
            diagonal(p+"H", r, c-1);
        }
    }
}

