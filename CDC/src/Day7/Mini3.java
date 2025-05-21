package Day7;

public class Mini3 extends Thread {
	public static void main(String[] args) {
		Mini3 m1=new Mini3();
		Thread t1=new Thread(m1);
		t1.start();
		System.out.println("hi");
		try {
			t1.sleep(20000);
		}catch
	}
	
}


