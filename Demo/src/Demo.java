/* ADITYA OJHA */
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		int sum_of_square=0;int sum=0; int square_of_sum=0;
		for(int i=1;i<=100;i++)
		{
			sum_of_square=sum_of_square+(i*i);
		}
		System.out.println(sum_of_square);
		for(int j=1;j<=100;j++)
		{
			sum=sum+j;
		}
		square_of_sum=sum*sum;
		System.out.println(square_of_sum);
		int difference=square_of_sum-sum_of_square;
		System.out.println(difference);
	}

}
