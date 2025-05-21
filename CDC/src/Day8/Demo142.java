package Day8;

public class Demo142 implements Runnable{
	public void run() {
		System.out.println("huuuuuu");
	}
	
	public static void main(String[] args) {
		Thread t1= new Thread(new Demo142());
		t1.start();
	}
}
