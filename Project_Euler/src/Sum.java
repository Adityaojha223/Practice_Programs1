import java.util.*;
public class Sum {

	public static void main(String[] args) 
	{
		long rem = 0;
		long sum =0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of exponent");
		int n = sc.nextInt();
		long number = (long) Math.pow(2,n);
		System.out.println(number);
		while(number>0)
		{
			rem = number % 10;
			sum = sum + rem;
			number = number / 10;
		}
		System.out.println(sum);

	}

}
