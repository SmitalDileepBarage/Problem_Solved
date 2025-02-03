package Interview_basic.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class D1_Inflix_Evaluation {

	public static void main(String[] args) throws IOException {

		System.out.println("Write Your Expression here:");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String exp =br.readLine();
		
		
		
		Stack<Integer>opand=new Stack<>();
		
		Stack<Character>optor=new Stack<>();
		
		for(int i=0;i<exp.length();i++) {
			
			char ch=exp.charAt(i);
			
			if(ch=='(') {
				optor.push(ch);
			}
			else if(ch==')') {
				while(optor.peek()!='(') {
				char sign=optor.pop();
				int v2=opand.pop();
				int v1=opand.pop();
						
				 int opv=operation(v1, v2, sign);
				 opand.push(opv);
				 
				}
				optor.pop();
			}
			else if(Character.isDigit(ch)) {
				opand.push(ch-'0');				
			}
			else if(ch=='+' || ch=='-' || ch=='*' ||ch=='/') {
				while(optor.size()> 0 && optor.peek()!='(' && precedence(ch)<= precedence(optor.peek()) ) {
					char sign=optor.pop();
					int v2=opand.pop();
					int v1=opand.pop();
							
					 int opv=operation(v1, v2, sign);
					 opand.push(opv);
				}
				optor.push(ch);
			}
			
			
		}
		
		while(optor.size()!=0) {
			char sign=optor.pop();
			int v2=opand.pop();
			int v1=opand.pop();
					
			 int opv=operation(v1, v2, sign);
			 opand.push(opv);
			 
			}
			
		System.out.println(opand.peek());
		
	}
	
	
	public static int precedence(char optor) {
		
		if(optor=='+')
		{	return 1;
			
		}
		else if(optor=='-') {
			return 1;			
		}
		else if(optor=='*') {
			return 2;			
		}
		else  {
			return 2;			
		}
	}
	
	public static int operation(int v1,int v2, char optor) {
		if(optor=='+')
		{	return v1+v2;
			
		}
		else if(optor=='-') {
			return v1-v2;			
		}
		else if(optor=='*') {
			return v1*v2;			
		}
		else  {
			return v1/v2;			
		}
		
		
	}
	
	
	

}
