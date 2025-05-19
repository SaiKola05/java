package Day4;

public class Demo5 {
	int x;
	int y;
	public Demo5(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	
	public Demo5(Demo5 t1) {
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
	}
	
	public static void main(String[] args) {
		Demo5 t1=new Demo5(45,23);
		Demo5 t2=new Demo5(t1);
		
	}
}
