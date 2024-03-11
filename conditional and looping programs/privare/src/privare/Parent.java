package privare;

public class Parent {
	private int money=100000;
}
class Child extends Parent{
	void party() {
		System.out.println("Father money"+money);
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.party();
	}
	
}
