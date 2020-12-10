//how to add multiple items together
import java.util.*;

public class AddAll{
	public static void main(String[] args){
		ArrayList<String> myList=new ArrayList<>();
		myList.add("Hello");
		
		ArrayList<String> newList=new ArrayList<>(Arrays.asList("jitendra","kumar"));
		
		myList.addAll(newList);
		System.out.println(myList);
		System.out.println(myList.get(0)); //to access items using det()
		
	}
}