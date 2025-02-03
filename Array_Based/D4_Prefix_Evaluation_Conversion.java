package Interview_basic.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class D4_Prefix_Evaluation_Conversion {

	public static void main(String[] args) throws Exception{
		
		System.out.println("Write your Expression:");
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		String exp=br.readLine();
		
		Stack<Integer>os=new Stack<>();
		Stack<String>ps=new Stack<>();
		Stack<String>is=new Stack<>();
		
		for(int i=exp.length()-1;i>=0;i--) {
			
			char ch=exp.charAt(i);
			
			
			
			
			
			if(ch=='+'||ch=='-'||ch=='*'||ch=='/') {
				int op1=os.pop();
				int op2=os.pop();
				int ValueOp=operation(op1, op2, ch);
				os.push(ValueOp);
				
				String pov1=ps.pop();
				String pov2=ps.pop();
				String  Valuepo=pov1+pov2+ch;
				ps.push(Valuepo);
				
				String v1=is.pop();
				String v2=is.pop();
				String Valueinf=v1+ch+v2;
				is.push(Valueinf);
				
				
			}else {
				os.push(ch-'0');
				ps.push(ch+"");
				is.push(ch+"");
				
			}
			
			
		}

		System.out.println("Operation :"+os.pop());
		System.out.println("Postflix:"+ps.pop());
		System.out.println("Inflix :"+is.pop());
	}
	
	
	public static int operation(int v1,int v2,char sign) {
		if(sign=='+') {
			return v1+v2;
		}
		else if(sign=='-')
		{
			return v1-v2;
		}
		else if(sign=='*') 
		{
			return v1*v2;
		}
		else {
			return v1/v2;
			}
	}

}
