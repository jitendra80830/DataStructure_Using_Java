//main class
import Mypackage1.Node1;
import java.util.LinkedList;

public class Main{
	public static void main(String[] args){
		Node1 n1=new Node1(2);
		Node1 n2=new Node1(3);
		Node1 n3=new Node1(4);
		
		n1.next=n2;
		n2.next=n3;
		System.out.println(n1.next.data);
		System.out.println(n1.next.next.data);
	}
}