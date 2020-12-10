//How to edit items
import java.util.*;

public class Edit1{
	
	public static void main(String[] args){
		
		ArrayList<String> myList=new ArrayList<>();
		
		myList.add("Hello");
		myList.add("jitendra");
		
		ArrayList<String> newList=new ArrayList<>(Arrays.asList("Hello","World"));
		
		myList.addAll(newList);
		//myList.set(0,"Hi"); // how can edit the index elements
		//System.out.println(myList);
		//myList.remove(index: 2); // how can remove or delete elements
		
		System.out.println(myList);
	}
}