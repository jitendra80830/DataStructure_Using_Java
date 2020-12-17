//stack for all data types and uses of some functions
import java.util.Stack;

public class Main{
	public static void main(String[] args){
		Stack stack=new Stack();
		stack.push("Hello");
		stack.push(2);
		stack.push('a');
		stack.push("World");
		
		stack.pop();
		stack.pop();
		stack.pop();
		//stack.pop();
		
		//System.out.print(stack.size()); //for size
		
		
		System.out.println(stack.isEmpty());
	}
}