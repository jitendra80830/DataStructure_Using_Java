package com.company;
import java.lang.*;
public class TextEditor {
    public static void main(String[] args){
        String input="hello";
        String ops="uuurr";

        String result=editor(input,ops);
        System.out.println(result);
    }
    public static String editor(String input,String ops) {
        LStack<Character> undo = new LStack<>();
        LStack<Character> redo = new LStack<>();

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            undo.push(ch);
        }
        for(int j=0;j<ops.length();j++){
            char current=ops.charAt(j);

            if(current=='u'){
                char  temp=undo.pop();
                redo.push(temp);
            }else{
                char temp=redo.pop();
                undo.push(temp);
            }
        }
        String result="";

        while(!undo.isEmpty()){
            result=result + undo.pop();
        }
        return result;
    }
}
