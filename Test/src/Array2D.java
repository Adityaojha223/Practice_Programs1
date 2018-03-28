import java.util.Scanner;
public class Array2D
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of row and column...");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("Rows : "+arr.length);   // arr.length = row
		System.out.println("Cols : "+arr[0].length);//arr[0].length = col
		
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