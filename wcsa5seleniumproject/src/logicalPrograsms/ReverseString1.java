package logicalPrograsms;

public class ReverseString1 {

	public static void main(String[] args) {

		String aString = "kiran";
		String bString = " ";
		char ch;

		for (int i = 0; i < aString.length(); i++) {

			ch = aString.charAt(i);
			bString = ch + bString;

		}

		System.out.println(bString);
	}
}