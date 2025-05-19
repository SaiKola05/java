package Day5;

class Demo13 {
		 void add() {
		System.out.println("hello");
	}
public class Demo14 extends Demo13 {
	public static void main(String[] args) {
		System.out.println("hi");
		Demo14 d1=new Demo14();
		d1.add();
	}

}
