//count frequency problem
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Problem1{
	public static void main(String[] args){
		
		String[] arr={"Hello","Hi","Hi","Hello","How","Hello","How"};
		
		HashMap<String,Integer> map=new HashMap<>();
		
		for(String item:arr){
			if(map.containsKey(item)){
				map.replace(item,map.get(item)+1);
			}else{
				map.put(item,1);
			}
		}
		System.out.println(map);
	}
}
		