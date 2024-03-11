class assignment2 
{public static void main(String[] args) 
	{int totalsum=0;
	int evensum=0;
	int oddsum=0;
	for (int i=1;i<=10 ;i++ )
		{totalsum=totalsum+i;
			if (i%2==0)
			{
				evensum=evensum+i;
			}
			if(i%2!=0)
			{
			oddsum=oddsum+i;
			}
		}
		System.out.println("Sum of first 10 numbers -->"+totalsum);
		System.out.println("Sum of first 10 even numbers-->"+evensum);
		System.out.println("Sum of first 10 odd numbers-->"+oddsum);
	}
}
