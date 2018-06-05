package com.company;

public class OneLinkedList {
    Element start;
    Element end;

    void add(int data){
        Element newElement = new Element();
        newElement.data = data;
        if(end == null){
            start = newElement;
            end = newElement;
        }
        else{
            end.next = newElement;
            end = newElement;
        }
    }

    void print(){
        Element tempElement = start;
        while (tempElement != null){
            System.out.print(tempElement.data + " ");
            tempElement = tempElement.next;
        }
    }

    void reverse(){
        Element tempElement = start.next;
        start.next = null;
        end = tempElement;
        while(tempElement != null){
            Element next = tempElement.next;
            tempElement.next = start.next;
            start.next = tempElement;
            tempElement = next;
        }
        Element standalone = start;
        start = start.next;
        standalone.next = null;
        end.next = standalone;
    }
}
