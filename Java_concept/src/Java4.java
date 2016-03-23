import java.util.Scanner;
/* factorial number */
public class Java4 {

	public static void main(String[] args) 
	{
		System.out.println("enter number: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		if(num1<0)
		{
			System.out.println("enter positive number");
		}
		else
		{
			int fact=1;
			for(int c=1;c<=num1;c++)  		// num1=4, 4*3*2*1=?, c=1-4
			{
				fact = fact*c;
			}
			System.out.println(fact);
		}

	}

}
