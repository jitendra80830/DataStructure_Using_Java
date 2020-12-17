package com.company;

public class LinkedList {
    Node head;

    public LinkedList(){

        this.head=null;
    }
    public void add(int item){
        //create a node
        Node newNode=new Node(item);

        //node- >next- >head
        newNode.next=head;

        //reassign head
        head=newNode;
    }
    public void addTail(int item) {
        Node newNode = new Node(item);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
                temp.next = newNode;
        }
    }
    public void insert(int value,int item){
        Node temp=head;

        while(temp!=null){
            if(temp.data==value){
                break;
            }
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Item not foud");
        }else {
            Node newNode = new Node(item);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void insertMiddle(int position,int item) {
        Node temp = head;
        int counter = 0;
        while (temp != null) {
            if (counter == (position - 1)) {
                break;
            }
            temp = temp.next;
            counter++;
        }
        if (temp == null) {
            System.out.println("Item not found");
        } else {
            Node newNode = new Node(item);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void deleteHead(){
        head=head.next;
    }
    public void deleteTail(){

        Node temp=head;

        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void deleteItem(int item){
        Node temp=head;

        while(temp.next!=null){
            if(temp.next.data==item){
                break;
            }
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Item not found");
        }else{
            temp.next=temp.next.next;
        }
    }
    public void print() {
        Node temp = head;

        while(temp!= null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }
}
