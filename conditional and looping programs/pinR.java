import java.util.Scanner;
class  pinR
{
	public static void validate(String pincode)
	{
		if (pincode.length()==6)
		{
			System.out.println("valid");
		}
			{
			System.out.println("invalid try again");
			System.out.println("invalid otry again");
			Scanner sc= new Scanner(System.in);
			String pinco=sc.next();
			validate(pinco);
		}

	}
	public static void main(String[] args) {

		pinR.validate("12345");
	}
}
