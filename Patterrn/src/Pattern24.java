import java.util.Scanner;

public class Pattern24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 ||j==(n-1) || i==j) {	
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}

}
