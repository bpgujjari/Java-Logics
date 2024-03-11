class assignment1 
{
	public static void main(String[] args) 
	{
		int totalsum=0;
		for (int i=1;i<=10 ;i++ )
		{
			totalsum= totalsum+i;

		}
		System.out.println("Sum of 1 to 10 numbers"+totalsum);

		int evensum=0;
		for (int i=1;i<=10 ;i++ )
		{
			if (i%2==0)
			{
				evensum=evensum+i;
			}

		}
		System.out.println("Sum of 1 to 10  even numbers "+evensum);

		int oddsum=0;
		for (int i=1;i<=10 ;i++ )
		{
			if (i%2!=0)
			{
				oddsum=oddsum+i;
			}

		}
		System.out.println("Sum of 1 to 10  odd numbers "+oddsum);

	
	}
}
