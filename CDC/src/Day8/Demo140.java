package Day8;
public class Demo140 implements Runnable{
	public void run() {
		System.out.println("hi");
		
	}

	public static void main(String[] args) {
		Demo140 t1=new Demo140();
		
		
		Thread p1=new Thread(t1);
		Thread p2=new Thread(t1);
		
		System.out.println("hello");
		p1.start();
		p2.start();
		

	}

}