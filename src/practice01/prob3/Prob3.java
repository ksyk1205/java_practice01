package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		int sum = 0 ;
		if((number % 2)==1) {
			for(int i=1; i<=number; i++) {
				if(number%i==0) {
				sum += i ;
				
				}	
			}
			System.out.print("결과 값 :"+sum );
			
		}
		else if((number % 2)==0){
			for(int i=1; i<=number; i++) {
				if((number%i)==0){
					sum += i ;
				}
				else {
				}

			}
			System.out.print("결과 값 :"+sum );
	}
}
}

