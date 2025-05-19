package Day6;

class Demo57 {
	public static void show() {
		System.out.println("hi");
	}
	static class Demo69{
		static void print() {
			System.out.println("bachan");
			show();
		}
	}

}
public class Demo58 {
	public static void main(String[] args) {
		Demo57.Demo69.print();
	}
}
