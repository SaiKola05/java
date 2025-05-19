package Day4;

public class Demo6 {
	int x;
	int y;
	int z;
	public Demo6() {
		System.out.println("hi");
	}
	public Demo6(int x) {
		this.x=x;
		System.out.println(x);
	}
	public Demo6(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Demo6(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		Demo6 t1=new Demo6();
		Demo6 t2=new Demo6(23);
		Demo6 t3=new Demo6(23,45);
		Demo6 t4=new Demo6(23,45,67);
	}

}
