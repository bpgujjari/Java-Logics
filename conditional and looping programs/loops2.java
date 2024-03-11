class Test 
{
	public static void main(String[] args) 
	{
		int[] numbers ={29,56,78,45,34};
		System.out.println(numbers[3]);
		System.out.println("*****");

		for (int i=0;i<numbers.length ;i++ )
		{
			System.out.println(numbers[i]);
		}
		System.out.println("*****");
		for (int num:numbers )
		{
			System.out.println(num);
		}



	}
}
