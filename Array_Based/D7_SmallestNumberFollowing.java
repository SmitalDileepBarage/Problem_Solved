package Interview_basic.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class D7_SmallestNumberFollowing {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader( System.in));
		System.out.println("Enter your pattern:");
		String exp=br.readLine();
		
		Stack<Integer>result=new Stack<>();
		
		
		int num=1;
		
		for(int i=0;i<exp.length();i++) {
			
			char ch=exp.charAt(i);
			
			if(ch=='d') {
				result.push(num);
				num++;
			}
		else {
			result.push(num);
			num++;
			
			while(result.size()>0) {
				System.out.print(result.pop()+"");
			}
		}
			

	}
		result.push(num);
		while(result.size()>0) {
			System.out.print(result.pop()+"");
		}
		
}
}
