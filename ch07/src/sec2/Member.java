package sec2;

public class Member extends Customer{
		private String id;
		private String pw;
		
		//부모(Customer) 클래스는 super클래스 라고한다
		//상속받은 멤버필드를 접근하려면 super.필드명 
		//상속받은 멤버메소드 호출 super.메소드()
		//상속받은 생성자함수 접근 super()
		public Member(){
			super(); //이것은 Customer클래스에서 		public Customer(){} 를 뜻함
		}
		public Member(String name){
			super(name);//이것은 		public Customer(String name){this.name=name;} 을 뜻함
			//=super.setName(name);
			//super.name =name; 이거는 private라 직접접근 불가라 안됨
		}
		public Member(String name,String tel){
			super(name,tel);
		}
		public Member(String name,String tel,String email){
			super(name,tel,email);
		}
		public Member(String name,String tel,String email,String address){
			super(name,tel,email,address);
		}
		public Member(String name,String tel,String email,String address,int age){
			super(name,tel,email,address,age);
		}
		public Member(String name,String tel,String email,String address,int age,String id){
			super(name,tel,email,address,age);
			this.id=id;
		}
		public Member(String name,String tel,String email,String address,int age,String id,String pw){
			super(name,tel,email,address,age);
			this.id=id;
			this.pw=pw;
		}
		@Override
		public void getCustom() {
			// TODO Auto-generated method stub
			System.out.println(super.getName()+"고객님 감사합니다");
		}
		
		
		
		

		
}

