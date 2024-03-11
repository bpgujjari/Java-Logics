class marks 
{
	public static void main(String[] args) 
	{
		int [] marks={78,67,34,57,89};

		for (int i=0;i<marks.length ;i++ )
		{
			if (marks[i]<=35)
			{break;
			}
			System.out.println(marks[i]);
		}

		System.out.println("*****");
			int [] mark={78,67,34,57,89};

		for (int i=0;i<mark.length ;i++ )
		{
			if (mark[i]<=35)
			{continue;
			}
			System.out.println(mark[i]);
		}
		
	}
}
