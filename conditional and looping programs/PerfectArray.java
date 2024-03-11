class PerfectArray 
{
	public static void main(String[] args) 
	{
		int[] arr={10,20,30,6,80,151};
		for (int i =0;i<arr.length ;i++ )
		{	int sum=0;
			for (int j=1;j<arr[i] ;j++ )
			{if (arr[i]%j==0)
				sum=sum+j;
			}if (sum==arr[i])
			System.out.println(arr[i]+"-is a palindrome");
			else
				System.out.println(arr[i]+"-is not a palindrome");
		}
	}
}
