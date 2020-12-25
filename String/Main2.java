/*String and use of split,strip and toCharArray and substring*/
import java.util.Arrays;

class Main2{
	public static void main(String[] args){
		String str="i am jitendra kumar and i am from computer science";
		
		//split
		System.out.println(Arrays.toString(str.split("")));
		
		System.out.println(Arrays.toString(str.split("a")));
		
		//strip
		String name1="  jitendra kumar    ";
		System.out.println(name1.strip());
		
		//toCharArray
		System.out.println(Arrays.toString(name1.toCharArray()));
		
		//subString
		System.out.println(name1.substring(3));
		System.out.println(name1.substring(3,7));
		
	}
}