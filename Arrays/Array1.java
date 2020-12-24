/*Array in java using all functions*/
//import java.util.Array;
import java.util.Arrays;

public class Array1{
	public static void main(String[] args){
		String[] productName={"onelpus","sumsung","Apple","Xiomi"};// Array Declaration
		
		int productPrice[]={100,299,2011,300};//another way of array declaration
		
		//How to print an Arrays
		System.out.println(Arrays.toString(productName));
		System.out.println(Arrays.toString(productPrice));
		
		//Accessing items
		System.out.println(productName[1]);
		
		//Eidit iotems
		productName[0]="Realme";
		System.out.println(Arrays.toString(productName));
		productName[1]="Google";
		System.out.println(Arrays.toString(productName));
		
		//Finding the length of Arrays
		System.out.println(productName.length);
		
		//Traversing Using For loop
		for(int i=0;i<productName.length;i++){
			System.out.println(productName[i]);
		}
		
		//The Foreach Loop
		for(String product : productName){
			System.out.println(product);
		}
		
		
	}
}
		
		