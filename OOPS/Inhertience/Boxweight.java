package com.OOPS.Inhertience;

public class Boxweight extends Box{
    int weight;
    
    public Boxweight(int l,int h,int w,int weight){
        super(l,h,w);
        this.l = l;
        this.h = h;
        this.w = w;
        this.weight = weight;
    }
}
