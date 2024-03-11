import java.util.Scanner;
class PinRecursion 
{
	public static void validate(String pincode)
		if (pincode.length()==6)
		{
			System.out.println("your pin is valid");
		}
		else{
			System.out.println("Your pin is invalid try again");
		
		Scanner sc= new Scanner(System.in);
		String pincode = sc.next();
		validate(pinco);
		}

	public static void main(String[] args) 
	{
		String pin ="12345";
		PinRecursion.validate();
	}
}
