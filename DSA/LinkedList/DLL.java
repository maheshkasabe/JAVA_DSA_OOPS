package com.LinkedList;

public class DLL{
    Node head;

    public DLL(){
        this.head = null;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        head = node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(){

    }


    public class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }

}