package com.LinkedList;

public class LL{
    Node head;
    Node tail;
    int size;

    LL(){
        this.size = 0;
    }

    public class Node{
        int value;
        Node next;
        int index;

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

        public Node(Node next, int value){
            this.next = next;
            this.value = value;
        }

        public Node(int value){
            this.value = value;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(head == null){
            tail=head;
        }
        size+=1;
    }    

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }   

    public int deleteLast(){
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        size++;
        System.out.println("END");
    }

    
}