import java.util.Scanner;

 class Test{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int length=sc.nextInt();
		int[]arr=new int [length];
		for(int i=0;i<length;i++)
		{
			System.out.println("Enter a element"+i+"index");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a target element");
		int target = sc.nextInt();
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==target)
				System.out.println(target+"-found at index"+j);
		}
	}
	
	}
	
