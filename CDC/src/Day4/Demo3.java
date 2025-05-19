package Day4;

public class Demo3 {
	int a=89;
	public void add() {
		System.out.priintln("add");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		Demo3 t1=new Demo3();
		t1.sub();
	}

}
