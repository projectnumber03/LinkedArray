package com.company;

public class Main {

    public static void main(String[] args) {
        OneLinkedList oll = new OneLinkedList();
        oll.add(1);
        oll.add(2);
        oll.add(3);
        oll.add(4);
        oll.add(5);
        oll.print();
        System.out.println("");
        oll.reverse();
        oll.print();
    }
}
