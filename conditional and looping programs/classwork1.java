public class classwork1 {
	public static void main(String args[])
{
	int n=10;
	for(int i=1;i<=n;i++)
	{	boolean isPrime=true;
		int k=i;
		for(int j=2;j<=i;j++)
		{
			if(k%j==0)
				isPrime=false;
		}
		if(isPrime==true)
		System.out.println(k);
	}

}
}
