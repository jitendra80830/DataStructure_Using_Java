//Uses of PutAll fn
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Put_All{
	public static void main(String[] args){
		
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Nmae",20);
		map.put("Roll",2);
		map.put("Age",19);
		
		HashMap<String,Integer> newMap=new HashMap<>();
		newMap.put("Apple",20);
		newMap.put("Banana",32);
		
		map.putAll(newMap);
		System.out.println(map);
	}
}