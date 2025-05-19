package Day5;
class Movie {
	void Genre() {
		System.out.println("crime and thriller");
	}
}
class Og extends Movie {
	void Action() {
		System.out.println("investigation");
	}
}
class Hero extends Og {
	void Name() {
		
	System.out.println("PSPK");
	}
}
class Heroine extends Og {
	void Look() {
		System.out.println("priyanka");
	}
}
public class Demo12 {
	public static void main(String[] args) {
		Hero h1=new Hero();
		Heroine s1=new Heroine();
		h1.Action();
		h1.Gener();
		h1.Name();
		s1.Look();
		
	}
}
