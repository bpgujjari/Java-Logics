class Array  
{
	public static void main(String[] args) 
	{
		int [] arr={2,5,6,8,10};
		for (int i=arr.length-1;i>=0 ;i-- )
		{
			int x=arr[i];
			int y=x*x*x;
			System.out.println(y+" ");
		}
	}
}
