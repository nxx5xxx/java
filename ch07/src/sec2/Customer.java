package sec2;

public class Customer {
		private String name;
		private String tel;
		private String email;
		private String address;
		private int age;
		//생성자
		//아무것도안넣었을때.
		//이름만 집어넣었을경우....
		//컨스트럭트 유징필드 > 슈퍼삭제 (이걸로 체크 하나씩 삭제하면 편함)
		public Customer(){}
		public Customer(String name){ this.name=name;}
		public Customer(String name, String tel){this.name=name; this.tel=tel;}
		public Customer(String name, String tel, String email){this.name=name; this.tel=tel; this.email=email;}
		public Customer(String name, String tel, String email,String address){this.name=name; this.tel=tel; this.email=email;this.address=address;}
		public Customer(String name, String tel, String email,String address,int age){this.name=name; this.tel=tel; this.email=email;this.address=address;this.age=age;}
		
		//메소드
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		//겟커스텀 "고객님 감사합니다"
		public void getCustom(){
			System.out.println("고객님 감사합니다");
		}
		
		
}
