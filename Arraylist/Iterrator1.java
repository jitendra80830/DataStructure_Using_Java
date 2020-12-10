//Uses of Iterator interface
import java.util.*;
public class Iterrator1{
	public static void main(String[] args){
		
		ArrayList<String> myList=new ArrayList<>();
		
		myList.add("Hello");
		myList.add("jitendra");
		
		ArrayList<String> newList=new ArrayList<>(Arrays.asList("Hello","World"));
		
		myList.addAll(newList);
		
		Iterator<String> iter=myList.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}