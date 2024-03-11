import java.util.Scanner;
class PrintData 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter studet id");
			int sid=sc.nextInt();
			System.out.println("Enter studet name");
			String sname=sc.next();
			System.out.println("Enter studet smarks");
			double smarks=sc.nextDouble();
			System.out.println("Studet id--"+sid);
			System.out.println("Studet name--"+sname);
			System.out.println("Studet marks--"+smarks);
			System.out.println("Do you want to get another student records: yes/no");
			String option=sc.next();
			if (option.equals("no"))
				break;
		}		
	}
}
