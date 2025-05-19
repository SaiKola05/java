package Day4;

public class Demo1 {
	private String FirstName;
	private String LastName;
	
	public void setFirstName(String fn) {
		FirstName=fn;
	}
	public void setLastName(String ln) {
		LastName=ln;
	}
	public String getFirstName() {
		return FirstName;
	}
		
		public String getLastName() {
			return LastName;
	}
	
	public static void main (String[] args) {
		Demo1 d1=new Demo1();
		d1.setFirstName("sai");
		d1.setLastName("nagesh");
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
		}

}
