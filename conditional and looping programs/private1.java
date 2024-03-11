package private1;

public class Father {
	 private int money=100000;
}
class Child extends Father{
	void party() {
		System.out.println("Fathar money.."+money);
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.party();
	}
	
}
