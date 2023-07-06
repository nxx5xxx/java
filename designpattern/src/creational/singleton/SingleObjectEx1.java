package creational.singleton;

public class SingleObjectEx1 {

	public static void main(String[] args) {
		SingleObject singletone = SingleObject.getInstance();
		SingleObject singletone2 = SingleObject.getInstance();
		singletone.showMessage();
		singletone2.showMessage();
		System.out.println(singletone==singletone2);
		
		

	}

}
