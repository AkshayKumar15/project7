import java.util.Scanner;

public class JavaB 
{

	public static void main(String[] args) 
	{
		System.out.println("enter first number: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("enter second number: ");
		int num2=sc.nextInt();
		System.out.println("enter third number: ");
		int num3=sc.nextInt();
		if(num1 > num2 & num1 > num3)
		{
			System.out.println("number first is greater =" + num1);
		}
		else if(num2 > num1 & num2 > num3)
		{
			System.out.println("number second is greater ="+ num2);
		}
		else
		{
			System.out.println("number third is greater="+num3);
		}
		

	}

}
