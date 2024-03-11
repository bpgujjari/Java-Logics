import java.util.Scanner;
class AssertExample 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
				System.out.println("Enter your salary.....");
				double sal=s.nextDouble();
						System.out.println("Enter your company name......");
						String cmp=s.next();
								System.out.println("Do you have house or not........yes/no");
						String house= s.next();


						assert cmp.equals("tcs"):" Better luck next time....1";
						assert sal>100000:"Better luck next time.........2";
						assert house.equals("yes"):"Better luck next time........3";


									System.out.println("Hello World!");


	}
}
