/* String*/
import java.util.Arrays;

public class Main1{
	public static void main(String[] args){
		String name="HelloWorld"; //declaration string
		
		String name1=new String("hello"); //you can declare also this way
		
		//Find the length
		System.out.println(name.length());
		
		//ueses of 'equals'
		if(name.equals(name1)){
			System.out.println("Same");
		}else{
			System.out.println("Different");
		}
		
		//concat
		System.out.println(name1.concat(" Jitendra"));
		
		//contains
		System.out.println(name.contains("W"));
		System.out.println(name.contains("x"));
		
		//loewrcase and uppercase
		System.out.println(name.toUpperCase()); //for Uppercase
		System.out.println(name.toLowerCase()); //for loewrcase
	}
}
		