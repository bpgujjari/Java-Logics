
public class ArmstrongArray {

	public static void main(String[] args) {
		int [] arr= {2,90,121,150,153,371,78,370};
		for(int i=1;i<arr.length;i++) {
		int OrgNum=arr[i];
		int power=String.valueOf(arr[i]).length();
		int res=0;
		while(arr[i]>0)
		{
		int rem = arr[i]%10;
		res+=Math.pow(rem,power);
		arr[i]=arr[i]/10;
		}
		if(res==OrgNum)
			System.out.println(OrgNum+"-is a Armstrong number ");
		}	
	}

}


	