package Interview_basic.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class D3_Postflix_Evaluation_Conversion {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Write Your Expression:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String exp=br.readLine();
		
		Stack<String>inflix=new Stack<>();
		Stack<String>preflix=new Stack<>();
		Stack<Integer>operValue=new Stack<>();

for (int i=0;i<exp.length();i++) {
	
	char ch=exp.charAt(i);
	
	if(ch=='+'||ch=='-'||ch=='*'||ch=='/') {
		
//		popping from various stacks when operator is on peek
		int op_v2=operValue.pop();
		int op_v1=operValue.pop();
		int ValueOp=operValue(op_v1, op_v2, ch);
		operValue.push(ValueOp);
		
		String pre_v2=preflix.pop();
		String pre_v1=preflix.pop();
		String  Valuepre=preflix(pre_v1, pre_v2, ch);
		preflix.push(Valuepre);
		
		String v2=inflix.pop();
		String v1=inflix.pop();
		String Valueinf=inflix(v1, v2, ch);
		inflix.push(Valueinf);
		
		
	}else {
		
		inflix.push(ch+"");
		preflix.push(ch+"");
		operValue.push(ch-'0');
		
		
	}
}

System.out.println("Inflix :"+inflix.pop());
System.out.println("Preflix :"+preflix.pop());

System.out.println("Operational Value :"+operValue.pop());




	}
	public static String preflix( String v1,String v2, char sign) {
		return sign+v1+v2;
	}
	public static String inflix( String v1,String v2, char sign) {
		return v1+sign+v2;
	}
	public static int operValue( int op_v1,int op_v2, char sign) {
		
		if(sign=='+') {
			return (op_v1)+(op_v2);
		}
		else if(sign=='-') {
			return (op_v1)-(op_v2);
		}
		else if(sign=='*') {
			return (op_v1)*(op_v2);
		}
		else {
			return (op_v1)/(op_v2);
		}
	}

}
