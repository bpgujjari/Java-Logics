class BubblesortSmallest
{public static void main(String args[])
	{
		int []arr={98,20,50,90,900,13};
		int smallest=arr[0];
		for (int i=1;i<arr.length ;i++ )
		{if (smallest>arr[i])
		{smallest=arr[i];
		}
		}
		System.out.println(smallest);
	}
}
