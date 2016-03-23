
public class Java5 {
/* prime number from 1 to 100 */
	public static void main(String[] args) 
	{
		int i=0;
		int num=0;
		String prime="";
		for(i=1;i<=100;i++)
		{
			
			int counter=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)		// num is even, it can't be prime
				{
					counter=counter+1;
				}
			}
			if(counter==2)
			{
				prime=prime+i+" , " ;
			}
		}
		System.out.println("prime number from 1 to 100 : ");
		System.out.println(prime);
		

	}

}
