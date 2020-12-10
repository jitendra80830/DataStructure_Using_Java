//Accssing value though keys
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main4{
	public static void main(String[] args){
		
		HashMap<String,Integer> map=new HashMap<>();
		
		map.put("Apple",20);
		map.put("Banana",30);
		map.put("Orange",43);
		
		System.out.println(map.get("Apple"));
		System.out.println(map.get("Orange"));
	}
}