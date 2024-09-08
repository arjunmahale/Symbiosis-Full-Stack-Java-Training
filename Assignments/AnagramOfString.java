package Java;


import java.util.Arrays;
public class AnagramOfString {

	public static void main(String[] args) {
		
		char string1[]= { 't', 'e', 's', 't'};
		char string2[]= {'t', 't', 'e', 'w'};
		int n1=string1.length;
		int n2=string2.length;
		if(n1==n2)
		{
			Arrays.sort(string1);
			Arrays.sort(string2);
			
				if(Arrays.equals(string1,string2))
				{
					System.out.println("the given string are anagram");
				}
//				else {
//					System.out.println("not anagram");
//				}
			
		}
		else {
			System.out.println("given string is not anagram");
		}
	
	

	}

}
