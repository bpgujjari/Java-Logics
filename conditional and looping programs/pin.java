import java.util.Scanner;
class pin
{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your PIN number");
			int pin= sc.nextInt();
		if (pin==1234)
		{
			System.out.println("Congratulations PIN is valid, stop the execution");
		}
		else if (pin!=1234)
		{
			System.out.println("re enter PIN try again!");
			for (int i=1; i<=4 ;i++ )
			{	int att=4-i;
				pin=sc.nextInt();
				if(pin==1234){
				System.out.println("Congratulations PIN is valid, stop the execution");
				}
			    else{
				System.out.println("invalid PIN try again!last.."+att+" attempts only");
				}}
			System.out.println("Bye Bye ur account blocked for 24 hours");
	   		}}}
		
	
