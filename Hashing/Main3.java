//multiple HashMap
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main3{
	public static void main(String[] args){
		
		HashMap<String,Integer> map=new HashMap<>();
		
		map.put("Apple",20);
		map.put("Mango",30);
		map.put("Guava",40);
		
		HashMap<String,Integer> newMap=new HashMap<>(map);
		
		newMap.put("Age",32);
		newMap.put("Weight",40);
		System.out.println(newMap);
	}
}