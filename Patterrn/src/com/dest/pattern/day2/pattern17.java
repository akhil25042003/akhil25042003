/**
 * 
 */
package com.dest.pattern.day2;

/**
 * 
 */
public class pattern17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j = 1;j<=i;j++) {
				if(i==5 || j==1 || i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("_ ");
				}
			}
			System.out.println();
		}


	}

}
