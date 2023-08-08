package logicalPrograsms;

import java.util.Iterator;

public class vowels {

	public static void main(String[] args) {

		String aString = "java is object oriented";
		int count = 0;

		for (int i = 0; i < aString.length(); i++) {

			if (aString.charAt(i) == 'a' || aString.charAt(i) == 'e' || aString.charAt(i) == 'i'
					|| aString.charAt(i) == 'o' || aString.charAt(i) == 'u') {

				count++; 

			}

		}
		
		System.out.println(count);
	}

}
