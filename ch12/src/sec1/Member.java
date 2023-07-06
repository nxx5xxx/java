package sec1;
//모든 클래스의 최고조상 클래스는 Object
//(extends Object 를 안해도 이게 기본적으로 적용된것)
public class Member {
		public String id;
		public String pw;
		
		public Member(){}
		
		public Member(String id) {
			super();
			this.id = id;
		}

		public Member(String id, String pw) {
			super();
			this.id = id;
			this.pw = pw;
			
			
			
			
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member ){
				return true;
			}
			return false;
		}
}
