class StrongArray  
{
	public static void main(String[] args) 
	{
		int n=1000;
			int sum=0;
		for (int j=0;j<=n;j++ )
		{
			int org=j;
			while(j>0)
			{
				int fact=1;
				int rem=j%10;
				for (int i=rem;i>0 ;i-- )
				fact=fact*i;
				sum=sum+fact;
				j=j/10;
			}
			if(sum==org)
				System.out.println(org+"-is a StrongNumber");
		}
	}
}
