/*2D Arrays and Uses of somes functions*/
import java .util.Arrays;

public class TwoD_Arrays1{
	public static void main(String[] args){
		int[][] matrix={{1,2,3},{4,5,6}};
		
		//print 2D_Arrays
		System.out.println(Arrays.deepToString(matrix));
		
		//Accesss Items from 2D Arrays
		System.out.println(matrix[0][2]);
		System.out.println(matrix[1][0]);
		
		//Edit Items
		matrix[1][1]=500;
		System.out.println(Arrays.deepToString(matrix));
		
		//Traversing 2D Arrays
		for(int[] i:matrix){
			for(int j : i){
				
				System.out.println(j);
			}
		}
	}
}