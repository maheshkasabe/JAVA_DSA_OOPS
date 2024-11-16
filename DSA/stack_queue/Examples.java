package com.stack_queue;

// import java.util.ArrayDeque;
// import java.util.Deque;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Stack;

public class Examples {
    public static void main(String[] args) throws Exception {
        // Stack<Integer> stack = new Stack<>();

        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println();

        // Queue<Integer> queue = new LinkedList();
        
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println();

        // Deque<Integer> deque = new ArrayDeque<>();
        
        // deque.addFirst(1);
        // deque.addLast(2);
        
        // System.out.println(deque.removeFirst());

        customStack stack = new customStack(8);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
