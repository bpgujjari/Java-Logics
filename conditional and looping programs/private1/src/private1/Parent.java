package private1;

public class Parent {
	 private int money=100000;
}
class Child extends Parent{
	void party() {
		int num1=10;
		System.out.println("Fathar money.."+num1);
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.party();
	}
	
}
