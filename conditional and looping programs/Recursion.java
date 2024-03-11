class Recursion 
{
	static void recursion(int num)
	{
		if (num<=10)
		{System.out.println(num);
			recursion(++num);
		}
	}


	public static void main(String[] args) 
	{
		Recursion.recursion(2);
	}
}
