import java.util.Scanner;
class cal
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter student roll number");
	int rlno=sc.nextInt();
	System.out.println("Enter student Name");
	String sname=sc.next();
	System.out.println("Enter science marks");
	int scim=sc.nextInt();
	System.out.println("Enter social marks");
	int socm=sc.nextInt();
	System.out.println("Enter maths marks");
	int matm=sc.nextInt();
	char grade='c';
		int total=scim+socm+matm;
		float avg=total/3;

		if (avg>=70)
			 grade='A';
		else if (50<avg && avg<70)
		grade='B';
		else if (40<avg && avg<50)
		grade='C';
		else
		grade='F';
		
		System.out.println("Student rollno:"+rlno);
		System.out.println("Student name:"+sname);
	    System.out.println("Student totalmarks:"+total);
		System.out.println("Student average:"+avg);
    	System.out.println("Student grade:"+grade);
	    }
}