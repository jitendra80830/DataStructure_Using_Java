//Using for loop print ArrayList
import java.util.*;

public class EachLoop{
	public static void main(String[] args){
		ArrayList<String> List1=new ArrayList<>();
		List1.add("Amar");
		
		ArrayList<String> List2=new ArrayList<>(Arrays.asList("Akabar","Andhoni"));
		
		List1.addAll(List2);
		
		for(String items:List1){
			System.out.println(items);
		}
	}
}
