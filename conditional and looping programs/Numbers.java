import java.util.Scanner;
class Numbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter startno");
		int startno=sc.nextInt();
		System.out.println("enter endno");
		int endno=sc.nextInt();
		System.out.println("1:all numbers  2:even numbers  3:odd numbers");
		int option=sc.nextInt();
		switch (option)
		{
		case 1:
			for (int i=startno;i<=endno ;i++ )
			System.out.println(i);
			for (int j=startno;j>=endno ;j-- )
			System.out.println(j);
			break;
			case 2:
			for (int i=startno;i<=endno ;i++ )
			if (i%2==0)
				System.out.println(i);
			for (int j=startno;j>=endno ;j-- )
				if (j%2==0)
				System.out.println(j);
			break;
			case 3:
			for (int i=startno;i<=endno ;i++ )
				if (i%2!=0)
				System.out.println(i);
			for (int j=startno;j>=endno ;j-- )
				if (j%2!=0)
				System.out.println(j);
			break;
		}
	}
}