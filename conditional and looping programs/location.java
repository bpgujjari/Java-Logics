import java.util.Scanner;
class  location
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur location-----Enjoy the day");
		String loc=sc.next();
		if(loc.equals("hyd")||loc.equals("sec"))
		{
			System.out.println("visit charminar-----Enjoy the day");
		}
		else if(loc.equals("vij")||loc.equals("bza"))
		{
			System.out.println("visit Durga temple-----Enjoy the day");
		}
		else if (loc.equals("ampt")||loc.equals("srn"))

		{
			System.out.println("visit Rathan sir classes...enjoy");
		}
		else{
			System.out.println("enter a valid location");
		}
	}
}
