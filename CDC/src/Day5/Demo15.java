package Day5;
interface I1 {
	void add();
}
class Demo16 {
	void sub() {
		System.out.println("hello");
	}
}

public class Demo15 extends Demo16 implements I1,I2 {
	public void add() {
		System.out.println("hii");
	}
	public void sub() {
		System.out.println("hiiiiii");
	}

}
