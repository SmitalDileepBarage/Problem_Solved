package Interview_basic.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class D5_Celebrity_Finding {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter Number of people:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	boolean status=false;
		int arr[][]=new int[n][n];
		
		Stack<Integer>people=new Stack<>();
		
		for(int i=0;i<n;i++) {
			String line=br.readLine();
			for(int j=0;j<n;j++) {
				arr[i][j]=line.charAt(j)-'0';
				
			}
			people.push(i);
		}

		while(people.size()>=2) {
			int i=people.pop();
			int j=people.pop();
			
			
			if(arr[i][j]==1) {
//				if i knows j --> i is not celebrity
				people.push(j);
			}
			else {
//				if i don't know j--> i is celebrity OR j is Not Celebrity
				people.push(i);
			}
		}
		int prob=people.pop();
		
		for(int i=0;i<=prob-1;i++) {
			
			if(arr[prob][i]==0 && arr[i][prob]==1) {
				
				status=true;
			}else {
				 status=false;
			}
		}
		
		if(status) {
			System.out.println(prob+" is Celebrity");
		}
		else {System.out.println(prob+" is Not Celebrity");}
	}

}
