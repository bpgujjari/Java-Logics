import java.util.Scanner;
class loc{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your location");
String loc=sc.next();


if(loc.equals("hyd")||loc.equals("sec"))
{
System.out.println("visit Charminar");
}
else if (loc.equals("vij")||loc.equals("bza"))
{
System.out.println("Visit Kanakadugra temple");
}

else if (loc.equals("ampt")|| loc.equals("srn"))
{
System.out.println("Visit Sathya Technologies -- enjoy rathan sir classes");
}
else{
System.out.println("enter a valid location");
}
}
}
