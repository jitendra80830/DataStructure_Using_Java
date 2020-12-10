//Accessing keys-values
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main6{
	
	public static void main(String[] args){
		
		HashMap<String,Integer> map=new HashMap<>();
		
		map.put("Apple",43);
		map.put("Banana",23);
		map.put("Orange",55);
		
		System.out.println(map.keySet()); //keys accessinh
		System.out.println(map.values()); //values Accessing
	}
}
	