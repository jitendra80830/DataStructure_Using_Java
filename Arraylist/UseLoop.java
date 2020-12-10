//Using for loop print ArrayList
import java.util.*;

public class UseLoop{
	public static void main(String[] args){
		ArrayList<String> List1=new ArrayList<>();
		List1.add("Amar");
		
		ArrayList<String> List2=new ArrayList<>(Arrays.asList("Akabar","Andhoni"));
		
		List1.addAll(List2);
		
		for(int i=0;i<List1.size();i++)
			System.out.println(List1.get(i));
	}
}
