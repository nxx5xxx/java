package sec2;

public class NonMember extends Customer{
		private String tempId; //임시아이디
		private int orderNum;
		private String tempPw;
		
		//부모(Customer) 클래스는 super클래스 라고한다
		//상속받은 멤버필드를 접근하려면 super.필드명 
		//상속받은 멤버메소드 호출 super.메소드()
		//상속받은 생성자함수 접근 super()
		
		//생성자 오버로딩
		public NonMember(){}
		public NonMember(String name){
			super(name);
		}
		public NonMember(String name,String tel){
			super(name,tel);
		}
		public NonMember(String name,String tel,String email){
			super(name,tel,email);
		}
		public NonMember(String name,String tel,String email,String address){
			super(name,tel,email,address);
		}
		public NonMember(String name,String tel,String email,String address,int age){
			super(name,tel,email,address,age);
		}
		public NonMember(String name,String tel,String email,String address,int age,String tempId){
			super(name,tel,email,address,age);
			this.tempId=tempId;
		}
		public NonMember(String name,String tel,String email,String address,int age,String tempId,int orderNum){
			super(name,tel,email,address,age);
			this.tempId=tempId;
			this.orderNum=orderNum;
		}
		public NonMember(String name,String tel,String email,String address,int age,String tempId,int orderNum,String tempPw){
			super(name,tel,email,address,age);
			this.tempId=tempId;
			this.orderNum=orderNum;
			this.tempPw=tempPw;
		}
		//public 클래스명(해당클래스 멤버필드){this.불러온멤버필드명=멤필명;}
		
		//겟커스텀 오버라이딩(메소드)
		@Override
		public void getCustom() {
			System.out.println("비회원 고객님 감사합니다.");
		}
		
		
}
