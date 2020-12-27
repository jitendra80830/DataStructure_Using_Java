/* Balanced paranthessis problem*/
import java.util.Stack;

public class BalanceParanthessis{
	public static void main(String[] args){
		String expression="{(a+b)+(c+d))}";
		balanced(expression);
	}
	public static void balanced(String expression){
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<expression.length();i++){
			char ch=expression.charAt(i);
			
			if(ch=='(' || ch=='{' || ch=='['){
				stack.push(ch);
			}else if(ch==')'){
				
				if(stack.size()==0){
				System.out.println("NOT BALANCED");
				return;
			}else{
				if(stack.peek()=='('){
					stack.pop();
				}else{
				System.out.println("NOT BALANCED");
				return;
				}
			}
			}else if(ch=='}'){
				
				if(stack.size()==0){
					System.out.println("NOT BLANCED");
					return;
				}else{
					if(stack.peek()=='{'){
						stack.pop();
					}else{
						System.out.println("NOT BALANSED");
					}
					}
				}else if(ch==']'){
					
					
					if(stack.size()==0){
						System.out.println("NOT BALANCED");
						return;
					}else{
						if(stack.peek()=='['){
							stack.pop();
						}else{
							System.out.println("NOT BALANCED");
						}
					}
				}
			}
			
			if(stack.size()==0){
				System.out.println("BALANCED");
			}else{
				System.out.println("NOT BALANCED");
			}
		}
	}
							
		