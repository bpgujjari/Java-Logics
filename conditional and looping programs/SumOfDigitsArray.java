class SumOfDigitsArray 
{
	public static void main(String[] args) 
	{
		int[] arr={10,23,52,55,56,78};
		for (int i=0;i<arr.length ;i++ )
		{	int sum=0;
			while (arr[i]>0)
			{
				int rem=arr[i]%10;
				sum=sum+rem;
				arr[i]=arr[i]/10;
			}
			System.out.println(sum+" ");
		}
	}
}
