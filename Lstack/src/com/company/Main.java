package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LStack<Integer> lStak=new LStack<>();

        lStak.push(2);
        lStak.push(4);
        lStak.push(5);
        lStak.push(7);

        int data= lStak.pop();
        data= lStak.pop();
        //data= lStak.pop();
        //data= lStak.pop();

        System.out.println(data);

        System.out.println(lStak.isEmpty());

        System.out.println(lStak.peek());

        //lStak.display();
    }
}
