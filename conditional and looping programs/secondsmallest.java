class secondsmallest 
{
	public static void main(String[] args) 
	{
		int[] arr={8,2,3,4,6,90};
		int temp=0;
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=i+1;j<arr.length ;j++ )
			{
				if (arr[i]<arr[j])
				{	temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
		System.out.println("second smallest number in array is"+arr[arr.length-2]);
	}
}
