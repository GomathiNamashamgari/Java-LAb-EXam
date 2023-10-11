package Package4;

import java.util.Scanner;

public class Switchcaseprogram 
{
	void m1()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter the student:");
			String name=sc.next();
			System.out.println("Enter the attendence percentage:");
			double attendencepercentage =sc.nextDouble();
			
			System.out.print(name + ":");
			int grade;
			if(attendencepercentage > 90)
			{
				grade = 1;
			}
			else if(attendencepercentage >= 80)
			{
				grade = 2;
			}
			else if(attendencepercentage >= 70)
			{
				grade = 3;
			}
			else if(attendencepercentage >= 60)
			{
				grade = 4;
			}
			else 
			{
				grade = 5;
			}
			switch(grade)
			{
			case 1:
			{
				System.out.println("A");
				break;
			}
			case 2:
			{
				System.out.println("B");
				break;
			}
			case 3:
			{
				System.out.println("C");
				break;
			}
			case 4:
			{
				System.out.println("D");
				break;
			}
			case 5:
			{
				System.out.println("E");
				break;
			}
			default:
				System.out.println("Invalid Number");
			}
		}
	}
	public static void main(String[] args)
	{
		Switchcaseprogram scp=new Switchcaseprogram();
		scp.m1();
	}
}
