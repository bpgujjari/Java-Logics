import java.util.Scanner;
public class Test{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int m=sc.nextInt();
		for(int i=10;i<=m;i++)
		{
		int sum=0;
		int n=i;
		while(n>0||sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum+"-is lucky number for "+i);
		}
	}
}