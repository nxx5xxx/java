package sec5;

public class Singletonex1 {

	public static void main(String[] args) {
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		 System.out.println(sing1==sing2);

	}

}
