import java.util.Scanner;
class usernm
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your user name");
		Scanner sc=new Scanner(System.in);
		String username=sc.next();
		System.out.println("Enter your password");
		String password=sc.next();
		if(username.equals("Rathan") && password.equals("rathan@123"))
		System.out.println("Login successfully!");
		else
			System.out.println("login failed!");
	}
}
