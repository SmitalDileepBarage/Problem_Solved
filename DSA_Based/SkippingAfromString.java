package Interview_basic.dsa;

public class SkippingAfromString {

	public static void main(String[] args) {
		System.out.println("When we pass String as Argument:");
		String original="raj dileep Barage";
		System.out.println("\nOriginal String:"+original);	
		skippingA("",original);
		System.out.printf("\n\nWithout passing String as Argument:\nNew String:");
		String ans=skippingA1(original);
		System.out.println(ans);
		
	}
 
	
	private static void skippingA(String newString,String  original) {
		
		if(original.isEmpty()) {
			System.out.println("New String:"+newString);
			return ;
			
		}
		char ch=original.charAt(0);
		
		if(ch=='a') {
			skippingA(newString, original.substring(1));
		}
		else {
			skippingA(newString+ch,original.substring(1));
		}
		
	}
	
private static String skippingA1(String  original) {
		
		if(original.isEmpty()) {
			
			return "";
			
		}
		char ch=original.charAt(0);
		
		if(ch=='a') {
			return skippingA1(original.substring(1));
		}
		else {
			return ch+skippingA1(original.substring(1));
		}
		
	}
}
