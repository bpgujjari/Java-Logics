import java.util.Scanner;
class Switch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int first=sc.nextInt();
		System.out.println("Enter second number");
		int second=sc.nextInt();
		System.out.println("Enter any operator");
		String operator = sc.next();
		int res;
		switch (operator)
		{
		case "+":res=first+second;
				System.out.println("Addition of entered numbers is--"+res);
				break;
		case "-":res=first+second;
				System.out.println("Subtraction of entered numbers is--"+res);
				break;
		case "*":res=first+second;
				System.out.println("Multiplication of entered numbers is--"+res);
				break;
		case "/":res=first/second;
				System.out.println("division of entered numbers is--"+res);
				break;
		case "%":res=first+second;
				System.out.println("modulo division of entered numbers is--"+res);
				break;
		default:System.out.println("Enter a valid operator");
				break;

		}
	}
}
