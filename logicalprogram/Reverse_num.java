package logicalprogram;

public class Reverse_num {
	public static int getreverse(int n) {
		int rev = 0;
		int rem;
		while (n>0) {
			rem = n%10;
			rev = rev*10+(rem);
			n = n/10;
		}
		return rev;
		
	}

	public static void main(String[] args) {
		int n = 5343;
		System.out.println("Reverse Number is : "+getreverse(n));

	}

}
