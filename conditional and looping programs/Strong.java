class Strong
{
	public static void main(String args[])
	{
		int n=145;
		int sum=0;
		int orgNum=n;
		while(n>0)
		{	int fact=1;
			int rem=n%10;
			for (int i=rem;i>0 ;i-- )
			{fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if (orgNum==sum)
		System.out.println("Given number is Strong number"+orgNum);
	}
}