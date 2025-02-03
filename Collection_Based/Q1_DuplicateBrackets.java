package Interview_basic.collection;

import java.util.Scanner;
import java.util.Stack;

public class Q1_DuplicateBrackets {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter :");
		String str=sc.nextLine();
		
		
		Stack<Character>st=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(ch==')') {
				if(st.peek()=='(') {
					st.pop();
					System.out.println("Dupliacate: true.");
					return ;
					
			}
				else {
					while(st.peek()!='(')
					st.pop();
				}
				st.pop();
			}			
			else {
			
			st.push(ch);
	
			}
			
		}
		System.out.println("Duplicate:false.");	
		
		sc.close();
		
	}

}
