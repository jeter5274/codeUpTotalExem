package codeUpTotalExem;

import java.util.Scanner;

public class ex1093 {

	public static void main(String[] args) {
		
		int[] studentNo = new int[24];
		
		Scanner sc = new Scanner(System.in);
		int attendCount = sc.nextInt();
		
		for(int i=0; i<attendCount; i++) {
			int callStudent = sc.nextInt();
			studentNo[callStudent-1]++;
		}
		
		for(int i=0; i<studentNo.length; i++) {
			System.out.print(studentNo[i] +" ");
		}
		
		sc.close();
	}

}
