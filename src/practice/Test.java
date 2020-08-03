package practice;

public class Test {
	
	/***
	 * Write a Java program to find the longest substring from a given string which doesn�t contain any duplicate characters                            
	 */
	public static void main(String[] args) {
		String str = "selenium and coding";
		str.replaceAll(" ", "");
		char[] words = str.toCharArray();

		String longestChar = null;
		int sizeOfSubstring = 0;

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (Character word : words) {
			Integer count = map.get(word);
			if (count == null) {
				map.put(word, 1);
			} else
				map.put(word, ++count);
		}

		if (map.size() > sizeOfSubstring) {
			sizeOfSubstring = map.size();
			longestChar = map.keySet().toString();
		}

		System.out.println(str);
		System.out.println(sizeOfSubstring);
		System.out.println(longestChar);
	}

}
