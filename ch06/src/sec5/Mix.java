package sec5;

public class Mix {
		public int field1;
		protected int field2;
		int field3;
		private int field4;
		
		public void method1(){
				System.out.println("public method");
		}
		protected void method2(){
			System.out.println("protected method");
		}
		void method3(){
			System.out.println("default method");
		}
		private void method4(){
			System.out.println("private method");
		}
		
}
