package codeUpTotalExem;

import java.util.Scanner;

public class ex1080 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int stopNum = sc.nextInt();
		int i=1, result=0;
		
		
		while(true) {
			result += i;
			
			if(stopNum <= result) {
				break;
			}
			
			i++;
		}	
		
		System.out.println(i);
		
		sc.close();
	}
}
