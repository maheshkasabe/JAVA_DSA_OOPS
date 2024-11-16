package com.stack_queue;

public class dynamicStack extends customStack {
    public dynamicStack(){
        super(); // it will call customstack;
    }

    public dynamicStack(int size){
        super(size); // it will call size customstack
    }

    @Override
    public boolean push(int item){
        if(this.isFull()) {
            int[] temp = new int[data.length * 2];
        }
        return true;
    }
}
