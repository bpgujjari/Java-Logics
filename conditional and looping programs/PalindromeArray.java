class PalindromeArray 
{
	public static void main(String[] args) 
	{
		int [] arr={10,20,121,454,234,565};
		for (int i=0;i<arr.length ;i++ )
		{
			int org=arr[i];
			int rev=0;
			while(arr[i]>0)
			{
				int rem=arr[i]%10;
				rev=rev*10+rem;
				arr[i]=arr[i]/10;
			}
			if (rev==org)
			{
				//System.out.println(i+"-element in array is palindrome ...that is "+org);
				System.out.print("  "+org);
			}
		}
	}
}
