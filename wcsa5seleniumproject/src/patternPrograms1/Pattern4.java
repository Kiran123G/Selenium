package patternPrograms1;

public class Pattern4 {

	public static void main(String[] args) {
		int n=5;
		int k,i,j;
		
		for(i=0;i<=n;i++) {
			
				for(j=0;j<=n-i;j++) {
					System.out.print(" ");
				}
				for(k=1;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
				
		}
		
		for(i=n-1;i>0;i--) {
			
			for(j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
