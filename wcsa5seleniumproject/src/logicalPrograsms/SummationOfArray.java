package logicalPrograsms;

public class SummationOfArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int res = 0;

		for (int i = 0; i < a.length; i++) {
			res = res + a[i];
			System.out.println(res);
		}
	}

}
