class StrongArray  
{
	public static void main(String[] args) 
	{
		int [] arr={10,30,50,145,1,2,40585};
		for (int i=0;i<arr.length ;i++ )
		{
			int sum=0;
			int org=arr[i];
			while(arr[i]>0)
			{
				int fact=1;
				int rem=arr[i]%10;
				for (int j=rem;j>0 ;j-- )
				{fact=fact*j;
				}
				sum=sum+fact;
				arr[i]=arr[i]/10;
			}
			if(sum==org)
				System.out.println(org+"-is a StrongNumber");
		}
	}
}
