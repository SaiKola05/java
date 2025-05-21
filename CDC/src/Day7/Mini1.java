package Day7;
import java.util.*;

public class Mini1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a and b values: ");
		try {
			int a= scanner.nextInt();
			int b= scanner.nextInt();
			int c=a/b;
			System.out.println("Result: "+c);
			System.out.println(c);
		}catch(ArithemeticException|InputMismatch e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("hiiii");
		}
	}
}
