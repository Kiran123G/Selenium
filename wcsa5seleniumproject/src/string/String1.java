package string;

public class String1 {

	public static void main(String[] args) {
		String originalString = "A1B2C#D4@";
		String aString = " ";
		String bString = " ";
		String cString = " ";
		char ch;

		for (int i = 0; i < originalString.length(); i++) {

			if (originalString.charAt(i) >= 'A' && originalString.charAt(i) < 'Z') {
				aString = aString + originalString.charAt(i);

			} else if (originalString.charAt(i) > '0' && originalString.charAt(i) < '9') {

				bString = bString + originalString.charAt(i);

			}
			
			else {
				cString = cString+originalString.charAt(i);
			}

		}
		System.out.println(aString);
		System.out.println(bString);
		System.out.println(cString);

	}

}
