import java.util.Scanner;

public class PatternName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 || j==(n/2)) && i!=0 || i==n/2 && j<5 || i==0 && j!=0 && j<5 && j!=5) {	
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
		System.out.print("  ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i+j == n/2 || i-j==n/2) {	
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
		System.out.print("  ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==(n/2) || j==0  || j==(n-1)) {	
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
		System.out.println(" ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n/2 || i==0 || i==n-1) { 	
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("  ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				
				if(j==0|| i==n-1) { 
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("  ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 || i==(n/2) && j<5 || i==0 && j!=0 && j<5 && j!=5 || i==(n-1)&&j!=(n/2) && j<5 )) {	
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("  ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 && i<n/2 || i==0 && j<n/2 || i==n/2 && j<n/2 || j==n/2 && i>n/2 || i==(n-1)&& j<n/2 ) { 
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("  ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==(n/2) || j==0  || j==(n-1)) {	
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("  ");

	}

}
