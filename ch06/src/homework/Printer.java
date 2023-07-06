package homework;

public class Printer {
		//메소드 오버로딩
		public void println(int value){
			System.out.println("int대입 값 :"+value);
		}
		public void println(boolean value){	
			System.out.println("boolean대입 값 :"+value);
		}
		public void println(double value){
			System.out.println("Double대입 값 :"+value);
		}
		public void println(String value){
			System.out.println("String대입 값 :"+value);
		}
		
}
