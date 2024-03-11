import java.util.Scanner;
class  Lottery
{
	public static void main(String[] args) 
	{	
		int Sysguess=25;
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("Guess the value");
			int guess=sc.nextInt();
			if (guess<25)
			{System.out.println("Entered less than guess value enter a number again ");
			}
			else if (guess>25)
			{System.out.println("Entered more than guess value enter a number again");
			}
			else{
			System.out.println("Congratulations you got Lottery");
			break;
			}
		}
	}
}
