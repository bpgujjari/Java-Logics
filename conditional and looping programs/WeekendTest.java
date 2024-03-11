import java.util.Scanner;
      //  ----------SET -------A-----------// 
// Question 1.------Vowel or not
/*class VowelOrNot  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if ( ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{System.out.println(ch+"-is an vowel");
			
		}
	}
}*/
// question ----2----Characters in reverse order
/*
class CharacterReverse
{
	public static void main(String args[]){
		char[] arr={'a','b','c','d','e'};
		for (int i=arr.length-1;i>=0 ;i-- )
		{System.out.println(arr[i]+" ");
		}
		
	}
}
*/

//question 3-------number even digit sum
/*
class Evensum
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");//47568
		int num=sc.nextInt();
		int sum=0;
		while (num>0)
		{
			int rem=num%10;
			if(rem%2==0)
				sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
*/

//--------question 4----1toN
/*
class OnetoN
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");//47568
		int num=sc.nextInt();
		for (int i=1;i<=num ;i++ )
		{System.out.println(i);
		}
	}
}
*/
//--------question 4----N to 1
/*
class NtoOne
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");//47568
		int num=sc.nextInt();
		for (int i=num;i>=1;i-- )
		{System.out.println(i);
		}
	}
}
*/

// question 6---------perfect in array---
class PerfectArray
{
	public static void main(String args[]){
		int[] arr={2,4,6,7,8};
			for (int i=0;i<arr.length;i++)
			{
			int sum=0;
			for (int j=arr[i];j>0 ;i-- )
			{	int fact=1;
				if (arr[i]%j==0)
					fact=fact+j;
					sum=sum+fact;}
			if (arr[i]==sum)
				System.out.println(arr[i]+"-is a perfect number");
			}
		}
}





