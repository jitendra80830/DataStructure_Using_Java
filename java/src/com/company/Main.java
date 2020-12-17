package com.company;

public class Main {
    public static void main(String[] args){
        LinkedList List=new LinkedList();
        List.addTail(3);
        List.addTail(5);
        List.addTail(6);
        List.addTail(7);

        //List.print();

        List.insert(7,3);
        List.insert(5,3);
        List.insert(3,8);
        List.insert(6,10);

        //List.print();

        List.insertMiddle(2,12);


        //delete from head
        List.deleteHead();


        //delete from tail
        List.deleteTail();

        //delete from middle points
        List.deleteItem(6);
        List.deleteItem(3);


        List.print();
    }
}
