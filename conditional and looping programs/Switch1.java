import java.util.Scanner;
class Switch1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day");
		String day=sc.next();
		switch (day)
		{
		case "monday":
		case "tuesday":
		case "wednesday":
        case "thursday":
		case "friday":System.out.println("Weak days concentrate only on work");
		break;
        case "saturday":
		case "sunday":System.out.println("Enjoy the day");
		break;
		default:System.out.println("Enter a valid day");


		}
	}
}
