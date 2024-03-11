class BinarytoDecimal{
	public static void main(String[] args) {
		int n=1100;
		double decNum=0;
		int power=0;
		while(n>0)
		{
			int rem=n%10;
			decNum=decNum+rem*Math.pow(2,power);
			power++;
			n=n/10;		
		}
		System.out.println(decNum);
		
	}
}
class BinarytoDecimalArray{
	public static void main(String[] args) {
		int[] arr= {1100,11001,1110,11101};
		for(int i=0;i<arr.length;i++)
		{
		int n=arr[i];
		int decNum=0;
		int base=1;
		while(n>0)
		{
			int rem=n%10;
			decNum=decNum+rem*base;
			base=base*2;
			n=n/10;
		}
		System.out.println(arr[i]+"-->Decimal number is-->"+decNum);
		
	}
	}
}