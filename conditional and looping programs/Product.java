class Product 
{
	int pid;
	String pname;
	double pcost;
	int quantity;
	public static final String storeName="D-mart";
	public static final String storeLocation="Hyderabad";
	public static final double discount=5;
	Product(int pid, String pname, double pcost,int quantity)
	{
		this.pid=pid;
		this.pname=pname;
		this.pcost=pcost;
		this.quantity=quantity;
	}
	void calTotal()
	{
		double totalAmt=pcost*quantity;
		double discAmt=totalAmt * discount/100;
		double netAmt=totalAmt-discAmt;
		System.out.println("Product name---"+pname+"  "+"Product ID---"+pid+" "+"Product cost---"+pcost);
		System.out.println("Total Amount---"+totalAmt);
		System.out.println("Dicsount Amount---"+discAmt);
		System.out.println("Net Amount---"+netAmt);
		System.out.println("Store Name---"+Product.storeName);
		System.out.println("Store Location"+Product.storeLocation);
	}
	public static void main(String[] args) 
	{
		Product p1=new Product(111,"mobile",15000.90,2);
		p1.calTotal();
		System.out.println("****");
		Product p2=new Product(22,"Laptop",50000.00,2);
		p2.calTotal();
		System.out.println("****");
		Product p3=new Product(555,"TV",100000.00,4);
		p3.calTotal();
	}
}
