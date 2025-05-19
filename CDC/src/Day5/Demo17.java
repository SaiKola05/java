package Day5;

interface I1{
	void add();
}

interface I2{
	void sub();
}

interface I3 extends I1,I2 {
	void mul();
}

class Demo18 {
	void div() {
		System.out.println("bachan");
	}
}

public class Demo17 extends Demo18 implement I3 {
	public void add() {
		System.out.println("hii");
	}
	public void sub() {
		System.out.println("hello");
	}
	public void mul() {
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		Demo17 n1=new Demo17();
		n1.add();
		n1.sub();
		n1.mul();
		n1.div();
	}

}
