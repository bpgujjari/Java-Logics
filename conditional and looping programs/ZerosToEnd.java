class Test1 
{
	public static void main(String[] args) 
	{
		int []arr={0,4,0,5,0,9};
		int count =0;
		for (int i=0;i<arr.length ;i++ )
		{
			if (arr[i]!=0)
			{
				arr[count]=arr[i];
				count++;
			}
		}
			while (count<=arr.length-1)
			{
				arr[count]=0;
				count++;
			}
		for (int i=0;i<arr.length;i++)
		{System.out.println(arr[i]);
		}
	}
}
