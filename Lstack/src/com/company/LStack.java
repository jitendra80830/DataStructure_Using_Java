package com.company;

public class LStack<T>{
    Node<T> top;

    LStack(){
        this.top=null;
    }
    public void push(T item){
        //insert into stack -->top(head)
        Node<T> node=new Node(item);
        node.next=top;

        top=node;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public T pop(){
        T data=null;
        if(isEmpty()){
            //data=null;
            System.out.println(-1);
        }else{
            data=top.data;
            top=top.next;
        }
        return data;
    }
    public T peek(){
        return top.data;
    }
    public void display(){
        Node temp=top;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
