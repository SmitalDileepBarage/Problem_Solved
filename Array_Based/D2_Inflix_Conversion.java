package Interview_basic.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class D2_Inflix_Conversion {

	public static void main(String[] args) throws IOException {
	
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String exp=br.readLine();
		
		
		Stack<Character>operation=new Stack<>();
		Stack<String>postflix=new Stack<>();
		Stack<String>preflix=new Stack<>();
		
		
		
	for(int i=0;i<exp.length();i++) {
		char ch=exp.charAt(i);
		
		if(ch=='(') {
			operation.push(ch);
		}
		
		else if((ch >='0' && ch<='9')||(ch >='a' && ch<='z')||(ch >='A' && ch<='Z')) {
			postflix.push(ch+"");
			preflix.push(ch+"");
		}
		else if(ch==')') {
			while(operation.peek()!='(') {
				char sign=operation.pop();
				
				String post_v2=postflix.pop();
				String post_v1=postflix.pop();
				String postV=postfixAdding(post_v1,post_v2,sign);
				postflix.add(postV);
				
				
				
				String pre_v2=preflix.pop();
				String pre_v1=preflix.pop();
				String preV=prefixadding(pre_v1,pre_v2,sign);
				preflix.add(preV);
			}
			operation.pop();
			
		}
		else if(ch=='+'||ch=='-'||ch=='*'||ch=='/') {
			while(operation.size() > 0 && operation.peek()!='(' && precedence(ch)<=precedence(operation.peek())) {
               char sign=operation.pop();
				
				String post_v2=postflix.pop();
				String post_v1=postflix.pop();
				String postV=postfixAdding(post_v1,post_v2,sign);
				postflix.add(postV);
				
				
				
				String pre_v2=preflix.pop();
				String pre_v1=preflix.pop();
				String preV=prefixadding(pre_v1,pre_v2,sign);
				preflix.add(preV);
			}
			operation.push(ch);
		}
		
	}

	while(operation.size()>0) {
		char sign=operation.pop();
		
		String post_v2=postflix.pop();
		String post_v1=postflix.pop();
		String postV=postfixAdding(post_v1,post_v2,sign);
		postflix.add(postV);
		
		
		
		String pre_v2=preflix.pop();
		String pre_v1=preflix.pop();
		String preV=prefixadding(pre_v1,pre_v2,sign);
		preflix.add(preV);
	}

	
	
	
	System.out.println("PostFlix :"+postflix.pop());
	System.out.println("Preflix :"+preflix.pop());

	}
	
	public static int precedence(char ch) {
		if(ch=='+') 
		{
			return 1;
					
		}
		else if(ch=='-') 
		{
		return 1;	
			
		}
		
		else if(ch=='*')
		{
		return 2;
		}
	else {
		
		
		return 2;
	}
	}
	
	public static String postfixAdding(String v1,String v2,char sign) {
		
		return v1+v2+sign+"";
		
	}
    public static String prefixadding(String v1,String v2,char sign) {
		
		return sign+v1+v2+"";
		
	}

}
