package sec1;

public class Product {
		public int no;
		public String pname;
		public Product(){	}
		public Product(int no){
			this.no = no;
		}
		public Product(int no, String pname){
			this.no = no;
			this.pname = pname;
		}
		@Override
		public int hashCode() {
			return super.hashCode() % 1000;
		}
		@Override
		public String toString() {
			return "no : " +this.no+", pname : " +this.pname ;
		}
		
		
		@Override
		protected Product clone() throws CloneNotSupportedException { //원래는 복제하는 명령
			return this.clone();
		}
		
		
		@Override
		protected void finalize() throws Throwable {//소멸자 : 객체를 제거
			System.out.println("요청한 객체를 제거하였습니다");
			this.finalize();
		}
		
		
		
		
		
}
