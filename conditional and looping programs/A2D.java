/*class A2D
{
	public static void main(String[] args) 
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		int arr1[][]=new int[3][3];

			for (int i=0;i<arr.length;i++ )
			{
				for (int j=0;j<arr[i].length;j++ )
				{
					arr1[i][j]=arr[j][i];
					System.out.print(arr1[i][j]+"  ");
				}
				System.out.println(" ");
			}
		}
}

class A2D
{
	public static void main(String[] args) 
	{
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

			for (int i=0;i<arr.length;i++ )
			{
				for (int j=0;j<arr[i].length;j++ )
				{
					boolean isPrime=true;
					for (int k=2;k<=arr[i][j]/2;k++)
					{
						if (arr[i][j]%k==0)
						{	isPrime=false;
							break;
						}
				}
					if (isPrime==true)
					{System.out.print(arr[i][j]+"  ");
					}
			}
		}
}
}
*/
import java.util.Scanner;
class TooYoungException extends RuntimeException
{TooYoungException(String msg)
	{super(msg);}
}
class TooOldException extends RuntimeException
{TooOldException(String msg1)
	{super(msg1);}
}
class Test
{
	public static void Status(int age)
	{
		if (age<18)
		{throw new TooYoungException("You are not  eligible for marriage!-Try after some time");
		}
		else if(age>35){
			throw new TooOldException("You are not eligible for marriage!-Aipaaye");
		}
		else 
		{
			System.out.println("You are eligible for marriage for - Enjoy pandagow");
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s.nextInt();
		Test.Status(age);
	}
}



create database local;
use local;


create table user(id int(4), name varchar(15));
insert into user values(1,'local1');
insert into user values(2,'local2');
insert into user values(3,'local3');


create database dev;
use dev;


create table user(id int(4), name varchar(15));
insert into user values(1,'dev1');
insert into user values(2,'dev2');
insert into user values(3,'dev3');


create database prod;
use prod;


create table user(id int(4), name varchar(15));
insert into user values(1,'prod1');
insert into user values(2,'prod2');
insert into user values(3,'prod3');


create database qa;
use qa;


create table user(id int(4), name varchar(15));
insert into user values(1,'qa1');
insert into user values(2,'qa2');
insert into user values(3,'qa3');