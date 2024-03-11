import java.util.Scanner;
class  Whileloop
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting number");
		int fno=sc.nextInt();
		System.out.println("Enter Ending number");
		int eno=sc.nextInt();
		System.out.println("******");
		while(fno<=eno){
			System.out.println(fno);
			fno++;
		}
	}
}
