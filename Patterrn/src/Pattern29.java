import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0; j<n;j++) {
				if(j%2==0 || j==0 ) {	
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			
			System.out.println();
		}

	}

}
