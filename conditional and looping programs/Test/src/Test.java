class Test{
	public static void main(String[] args) {
		int n=10;
		int k=0;
		int[]arr=new int[10];
		for(int i=2;i<=10;i++)
		{
			boolean pr=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					pr=false;
			}
				if(pr==true)
				{	arr[k]=i;
					k++;
				}
		}
		int sum=arr[0]+arr[k-1];
		System.out.println(sum);
		
		}
	}