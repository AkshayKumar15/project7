
public class Java6 
{

	static void test1()
	{
		System.out.println("test method");
	}
	
	static int test1(int i)
	{
		System.out.println("test2 method with return type");
		return 1;
	}

	
	
	public static void main(String[] args)
	{
	test1();
	test1(10);
	System.out.println(test1(10));

	}

}
