//Iteration
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Iteration1{
	public static void main(String[] args){
		
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Roll",2);
		map.put("Name",23);
		map.put("Age",40);
		
		for(String i:map.keySet()){
			System.out.println(i +map.get(i));
		}
	}
}