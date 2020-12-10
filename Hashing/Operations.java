//Opretions
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Operations{
	public static void main(String[] args){
		HashMap<String,Integer> map=new HashMap<>();
		
		map.put("Roll",1);
		map.put("Age",21);
		map.put("Sub",3);
		System.out.println(map.containsKey("Roll")); //for key checking
		System.out.println(map.containsValue(21)); //For value Checking
		System.out.println(map.size()); //For Size Checking
		System.out.println(map.isEmpty()); //For Checking empty or not
	}
}