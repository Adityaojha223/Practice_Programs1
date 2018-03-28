import java.util.Scanner;

class Student1

{
	int roll;
	String name;
	double cgpa;
}
public class SortingArrayOfObjects 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of student");
		int size = sc.nextInt();
		Student1 s[] = new Student1[size];
		
		for (int i = 0; i < s.length; i++) 
		{	
			s[i] = new Student1();
			System.out.println("Enter the roll , name , cgpa of student "+i);
			s[i]. roll = sc.nextInt();
			s[i]. name = sc.next();
			s[i]. cgpa = sc.nextDouble();
			System.out.println("----------------------------------------------");
		}
		System.out.println("All the student details ......");
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i].roll+"\t"+s[i].name+"\t"+s[i].cgpa);
		}
		System.out.println("Enter the value of type u want to sort  roll-1 , name-2 , cgpa -3");
		int n=sc.nextInt();
		if(n==1)
		{
			for (int i = 0; i < s.length-1; i++) 
			{
				if(s[i].roll<= s[i+1].roll)
				{
					int temp = s[i].roll;
					s[i].roll = s[i+1].roll;
					s[i].roll = temp;
					
				}
			}
			System.out.println("All the student details ......");
			for (int i = 0; i < s.length; i++) 
			{
				System.out.println(s[i].roll+"\t"+s[i].name+"\t"+s[i].cgpa);
			}
		}
	}
}
