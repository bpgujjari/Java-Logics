class BubbleSort_smallest 
{
	public static void main(String[] args) 
	{
		int []arr={50,60,12,70,80,90,999};
		int temp=0;
		for (int i =0;i<arr.length ;i++ )
		{for (int j=i+1;j<arr.length ;j++ )
		{if (arr[i]<arr[j])
		{temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}System.out.println(arr[i]);
		}
		System.out.println("Largest element in the array--"+arr[0]);
		System.out.println("Smallest element in the array--"+arr[arr.length-1]);
	}
}