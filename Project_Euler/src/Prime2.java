import java.util.*;
public class Prime2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth value ");
		int n= sc.nextInt();
		int count = 1;
		int num = 1;
		int i;
		while(count<=n)
		{
			num = num+1;
			for( i=2;i<=num;i++)
			{
				if(num%i==0)
					break;
			}
			if(i==num)
				count=count+1;
		}
		System.out.println("the nth prime is "+num);
	}
}