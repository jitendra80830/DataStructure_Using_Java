//how to add item from haed only integer
package Mypackage1;
import Mypackage2.Node1;
//import java.util.LinkedList;

public class LinkedList extends Node1{
	public Node head;
	
	public LinkedList(){
		this.head=null;
	}
	public void add(int item){
		//create a node
		Node newNode=new Node(item);
		
		//node- >next- >head
		newNode.next=head;
		
		//reassign haed
		head=newNode;
	}
	public void print(){
		Node temp=haed;
		
		while(item !=null){
			System.out.pritln(temp.data+" ");
			temp=temp.next;
		}
	}
}