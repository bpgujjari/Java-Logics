class PrimeNums100 
{
	public static void main(String[] args) 
	{
		int num=100;
		for (int i=1;i<=num ;i++ ){
			boolean status=true;
	
			for (int j=2;j<num/2;j++ ){
				if(i%j==0)
				status=false;
		}
		if(status==true)
		System.out.print(i+" ");
		}
		System.out.println("These are the prime numbers 1 to 100");
	}
}
