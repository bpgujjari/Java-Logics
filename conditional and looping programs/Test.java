class Test
{
	public static void main(String args[])
	{
		int[] arr={2,3,4,5,2,3,8,9};
		for (int i=0;i<arr.length ;i++ )
		{		int count=0;
				int ele=arr[i];
			for (int j=0;j<arr.length ;j++ )
			{
				if (arr[j]==ele)
				{
					count++;
				}
			}
		}
		if (count>0)
			{System.out.println(arr[i]);
			}
	}
}