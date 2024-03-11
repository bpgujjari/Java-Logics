import java.util.Scanner;
class pnz
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<0)
			System.out.println("Entererd number is a negetive number");
		else if(num==0)
			System.out.println("Entererd number is a zero");
		else
			System.out.println("Entererd number is a positive number");
	}
}
