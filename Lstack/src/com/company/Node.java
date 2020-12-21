package com.company;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T item){
        this.data=item;
        this.next=null;
    }
}
