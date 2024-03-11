import java.util.Scanner;
class Pin1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int	pin=1234;
		for (int i=1;i<=4 ;i++)
			{
				System.out.println("Enter your pin");
				int userpin=sc.nextInt();
				if (pin==userpin)
				{System.out.println("Congratulations vaild pin");
				break;
				}
				else{
					System.out.println("Wrong pin! enter again");
				}
				if (i==4)
				{
					System.out.println("Bye bye your account blocked for 24 hours");
				}}}}