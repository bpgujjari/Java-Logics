
public class Armstrong {

	public static void main(String[] args) {
		int n = 153;
		int OrgNum=n;
		int power=String.valueOf(n).length();
		int res=0;
		while(n>0)
		{
		int rem = n%10;
		res+=Math.pow(rem,power);
		n=n/10;
		}
		if(res==OrgNum)
			System.out.println(OrgNum+"-is a Armstrong number ");
		else
			System.out.println(OrgNum+"-is not an Armstrong number ");
		
			
	}

}
