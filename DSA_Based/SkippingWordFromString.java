package Interview_basic.dsa;

public class SkippingWordFromString {

	public static void main(String[] args) {
//		Skipping proper word
		String original="RajDileepBarage";
		System.out.println(skippingWord(original));

		
		
//		skipping some part of word like 
//		 skip only dil when its not Dileep... otherwise remain as it is
		
		String or="Tilakaratne Dilashan";
		System.out.println(skippingOrNotOriginal(or));

	}
private static String skippingWord(String  original)
{
		
		if(original.isEmpty()) 
		{
			return "";
		}
		
			if(original.startsWith("Barage"))
			{
			return skippingWord( original.substring(6));
		    }
		   else 
		    {
			return original.charAt(0)+skippingWord(original.substring(1));
		    }
		
}

private static String skippingOrNotOriginal(String  or)
{
		
		if(or.isEmpty()) 
		{
			return "";
		}
		
			if(or.startsWith("Dil") && (!or.startsWith("Dileep")))
			{
			return skippingOrNotOriginal( or.substring(3));
		    }
		   else 
		    {
			return or.charAt(0)+skippingOrNotOriginal(or.substring(1));
		    }
		
}



}
