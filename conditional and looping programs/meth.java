class meth
{
	void totalSum()
	{
		int totalsum=0;
		for (int i=1;i<=10 ;i++ )
		{
			totalsum=totalsum+i;
		}
		System.out.println("1 to 10 numbers total sum-->"+totalsum);
	}
	void evenSum()
	{
		int evensum=0;
		for (int i=1;i<=10 ;i++ )
		{
			if (i%2==0)
			{evensum=evensum+i;
			

			}
		}
		System.out.println("1 to 10 numbers total sum-->"+evensum);

	}

	void oddSum()
	{
		int oddsum=0;
		for (int i=1;i<=10 ;i++ )
		{
			if (i%2!=0)
			{
				oddsum=oddsum+i;
			}
		}
		System.out.println("1 to 10 numbers total sum-->"+oddsum);
	}


	public static void main(String[] args) 
	{
		meth m1=new meth();
		m1.totalSum();
		m1.evenSum();
		m1.oddSum();
	}
}
