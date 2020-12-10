//Find maximum word
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class MaxWord{
	public static void main(String[] args){
		
		String text ="The Pyramid of Neferirkare was built for the Fifth Dynasty pharaoh Neferirkar";
		
		
		String[] textArr=text.split("");
		
		HashMap<String,Integer> map=new HashMap<>();
		for(String item:textArr){
			if(map.containsKey(item)){
				map.replace(item,map.get(item)+1);
			}else{
				map.put(item,1);
			}
		}
		int max=0;
		String maxkey="";
		for(String key:map.keySet()){
			if(map.get(key)>max){
				max=map.get(key);
				maxkey=key;
			}
		}
		System.out.println(maxkey);
	}
}
		
		
