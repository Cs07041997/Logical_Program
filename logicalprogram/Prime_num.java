package logicalprogram;

import java.util.Scanner;

public class Prime_num {
	public static void getprime(int n) {
		int sum = 0;
		for(int i = 2;i<=n;i++) {
			if(n%1 ==0 && n%i ==0) {
				sum+=i;
			}
		}
		if (sum == n)
			System.out.println("It is prime num");
		else System.out.println("it is not prime num" );
		

	}

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		getprime(number);
		
		
		

	}
}
