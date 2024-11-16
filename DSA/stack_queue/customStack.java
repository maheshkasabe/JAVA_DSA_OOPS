package com.stack_queue;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);
    }

    public customStack(int size){
        this.data = new int[size];
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot POP");
        }
        return data[ptr--];
    }

    public int peek() {
        return data[ptr];
    } 
    
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr ==  data.length - 1;
    }
    
    public boolean isEmpty(){
        return ptr == -1;
    }
}
