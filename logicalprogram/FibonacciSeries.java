package logicalprogram;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0,n2=1,count=10;
		System.out.println(n1+""+n2);
		for(int i=2 ;i<count;++i);
		{
			int n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
