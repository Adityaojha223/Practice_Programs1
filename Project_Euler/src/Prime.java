import java.util.*;
public class Prime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int num = 1;
		int i;
		int sum=0;
		System.out.println("the result is");
		while(num<=10)
		{
			num = num+1;
			for( i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					break;
				}
				if(i==num)
					sum=sum+i;
			}
			
		}
		System.out.println("the sum is "+sum);
	}
}
