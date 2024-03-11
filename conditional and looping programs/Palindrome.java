class Palindrome
{
	public static void main(String[] args) 
	{
		int num=131;
		int rev=0;
		int org=num;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if (rev==org)
		{System.out.println(org+"--is a palindrome ");
		}
	}
}
