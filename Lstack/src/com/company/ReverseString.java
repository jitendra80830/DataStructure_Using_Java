package com.company;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your string");

        String userInput=scanner.nextLine();

        reverse(userInput);

    }
    public static void reverse(String str){
        StringBuilder sb=new StringBuilder(str);

        LStack<Character> stack=new LStack();

        //Insert chars inside the stack
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);

            stack.push(ch);
        }
        int counter=0;
        //sb=hello

        while(!stack.isEmpty()){
            sb.setCharAt(counter,stack.pop());
            System.out.println(sb);
            counter++;
        }
        System.out.println(sb);

    }
}
