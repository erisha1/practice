package practice;

public class Test {
	
	/***
	 * Write a Java program to find the longest substring from a given string which doesn�t contain any duplicate characters                            
	 */
	public static boolean uniqueWord(String s) {
		for(int i=0; i<s.length();i++) 
			for(int j=i+1; j<s.length();j++) 
				if(s.charAt(i)==s.charAt(j)) {
					return false;
				}
		return true;		
	}
	public static void main(String[] args) {
			String str =  "Hello how are fine you doin";
			String strArray [] = str.toLowerCase().split(" ");
			String uniqueStr="";
			int length=0;
			for(String s: strArray) {
				System.out.println(s);
				if(uniqueWord(s)) {
					if(length<s.length()) {
					length=s.length();
					uniqueStr=s+" ";
					}else if(length==s.length()) {
						uniqueStr+=s+" ";
					}
				}else {
					length=0;
					uniqueStr="";
				}
			}
			System.out.println("'"+str + "' Unique Longest Substring : "+ uniqueStr);
		} 
}
