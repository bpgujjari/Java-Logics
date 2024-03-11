class SumOfDigits 
{
	public static void main(String[] args) 
	{int num=153;
	 int org=num;
	 int sum=0;
	 int cube=1;
		while(num>0)
		{
			int rem=num%10;
			cube=rem*rem*rem;
			sum=sum+cube;
			num=num/10;

		}
		System.out.println("sum of the digits--"+sum);
		if(sum==org)
		System.out.println("Given number is a Armstronf num"+org);
	}
}
