/**
 * 
 */
package com.dest.pattern.day1;

/**
 * 
 */
public class Pattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				System.out.print(n + " ");
				n--;
			}
			System.out.println(" ");
		}

	}

}
