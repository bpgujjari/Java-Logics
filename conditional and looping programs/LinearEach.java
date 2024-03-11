class LinearEach 
{
	public static int Lin(int[]arr,int target){
		for (int i=0;i<arr.length ;i++ )
		{if (arr[i]==target)
			return i;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int []arr={2,3,4,5,6,7};
		for (int j=0;j<arr.length ;j++ )
		{int target=arr[j];
		int res=LinearEach.Lin(arr,target);
		if (target==arr[j])
		{System.out.println(target+"-element index"+j);
		}
		else
			System.out.println("Hello World!");
		}
	}
}
