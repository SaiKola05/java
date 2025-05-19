package Day6;

public class Demo55 extends Object {
	int a=69;
	void add() {
		System.out.println(a);
	}
	void sub() {
		System.out.println(this.a);
		this.add();
	}
	public static void main(String[] args)  {
		
	}

}
