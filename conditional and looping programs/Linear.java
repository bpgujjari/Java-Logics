public class Linear {
	public static int lin(int[]arr,int target)
	{	for(int i=0;i<arr.length;i++)
		{
		if(target==arr[i])
			{
			return i;
		}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int [] arr= {1,2,4,7,4,0};
		int target=5;
		int res=Linear.lin(arr,target);
		if(res!=-1) 
			{
			System.out.println("Element found at the index of-"+res);
		}
		else
			System.out.println("Element not found");
	}

}
