package Interview_basic.collection;

import java.util.Scanner;
import java.util.Stack;

public class Q2_BalancedBracket {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter :");
		String str = sc.nextLine();

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			}

			else {

				if (ch == ')') 
				{ 	if ((st.peek() == '('))
						st.pop();

					else if (st.size() == 0) {
						System.out.println("false");
						return;
					} else {
						System.out.println("false");
						return;
					}
				} 
				else if (ch == '}') 
				{	if ((st.peek() == '{'))
						st.pop();

					else if (st.size() == 0) {
						System.out.println("false");
						return;
					} else {
						System.out.println("false");
						return;
					}
				} 
				else if (ch == ']')
				{	if ((st.peek() == '['))
						st.pop();

					else if (st.size() == 0) {
						System.out.println("false");
						return;
					} else {
						System.out.println("false");
						return;
					}
				}
			}
			sc.close();
		}
		System.out.println("true");
		}
}
