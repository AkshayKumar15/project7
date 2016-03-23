import java.util.Scanner;

public class Java3 
{

	public static void main(String[] args) 
	{
		System.out.println("enter number: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		if(num1%2==0)
		{
			System.out.println("number is Even "+num1);
		}
		else
		{
			System.out.println("number is Odd "+num1);
		}

	}

}
