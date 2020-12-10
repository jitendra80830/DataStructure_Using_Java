//Uses of "putIfAbsent"
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Put_If_Absent{
	public static void main(String[] args){
		
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Roll",1);
		map.put("Age",18);
		map.put("sub",4);
		
		map.putIfAbsent("Name",3);
		map.putIfAbsent("Roll",20);
		
		map.replace("Roll",2);
		System.out.println(map);
	}
}