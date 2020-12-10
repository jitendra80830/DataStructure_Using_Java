//For Default values
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main5{
	public static void main(String[] args){
		
		HashMap<String,Integer> map=new HashMap<>();
		
		map.put("Roll",10);
		map.put("Age",19);
		map.put("sub",7);
		System.out.println(map.getOrDefault("Papaya",1));
	}
}