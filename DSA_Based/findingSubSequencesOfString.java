// Not included on github
package Interview_basic.dsa;

import java.util.ArrayList;

public class findingSubSequencesOfString {

	public static void main(String[] args) {
		String up="abc";
		
		System.out.println("Subsets :\n");
		subSequences(" ",up);
		
//		returning  list
		System.out.println("\n");
		System.out.println("List Of Subsets:\n");
		System.out.println(subSequencesList(" ",up));

	}
       
	static void subSequences(String processed,String unprocessed) {
		
		if(unprocessed.isEmpty()) {
			System.out.printf( processed);
			return;
		}
		
		char ch=unprocessed.charAt(0);
		
//		It's all about taking that particular element/char or not
		
//		taking it 
		subSequences(processed+ch,unprocessed.substring(1));
		
//		Not taking/Leaving it
		subSequences(processed,unprocessed.substring(1));

		
	}
	
	
static ArrayList<String> subSequencesList(String processed,String unprocessed) {
		
		if(unprocessed.isEmpty()) {
			ArrayList<String>list=new ArrayList<>();
			list.add(processed);
			return list;
		}
		
		char ch=unprocessed.charAt(0);
		
//		It's all about taking that particular element/char or not
		
//		taking it 
		ArrayList<String>left=subSequencesList(processed+ch,unprocessed.substring(1));
		
//		Not taking/Leaving it
		ArrayList<String>right=subSequencesList(processed,unprocessed.substring(1));

		left.addAll(right);
		return left;
		
	}
}
