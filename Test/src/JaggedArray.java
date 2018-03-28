/*Jagged array - if the column size of each row in a 2D array is different.*/
import java.util.Scanner;
public class JaggedArray
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of row ");
		int row = sc.nextInt();
		int arr[][] = new int[row][];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the col size for row"+i);
			int col = sc.nextInt();
			arr[i] = new int[col];  // important line.
		}
		
		input(arr);
		display(arr);
		
	}
	private static void display(int[][] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	private static void input(int[][] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter the array elements for row "+i);
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j]=sc.nextInt();
			}
	}
}
}