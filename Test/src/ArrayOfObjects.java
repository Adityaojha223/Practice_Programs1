import java.util.Scanner;

class Student
{
	int roll;
	String name;
	double cgpa;
}
public class ArrayOfObjects 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of student");
		int size = sc.nextInt();
		Student s[] = new Student[size];
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
			s[i] = new Student();
			System.out.println(s[i]);
			
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
	}
}
