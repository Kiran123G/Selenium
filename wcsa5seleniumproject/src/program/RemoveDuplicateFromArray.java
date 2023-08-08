package program;

import java.util.Arrays;


import java.util.stream.IntStream;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 4, 5, 6,5 ,6,7, 8 };
//		int[] c = new int[a.length + b.length];
//		int i = 0, j = 0, k = 0;
//		for (int i = 0; i < a.length; i++) {
//
//			c[i] = a[i];
//		}
//		while (i < a.length) {
//			c[k] = a[i];
//			k++;
//			i++;
//		}
//		while (j < b.length) {
//			c[k] = b[j];
//			k++;
//			j++;
//
//		}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
//		for (int i = 0; i < b.length; i++) {
//			c[i + a.length] = b[i];
//		}
		IntStream.concat(IntStream.of(a), IntStream.of(b))
	//	Arrays.stream(c)
		.distinct().sorted().filter(arr->arr%2!=0).forEach(ar -> System.out.print(ar + ","));
 
//		HashSet<Integer> h = new HashSet();
//		for (int i = 0; i < c.length; i++) {
//               h.add(c[i]);
//		}

//		System.out.println(h);
	}

}
