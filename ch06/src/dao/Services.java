package dao;

public class Services extends Product{ //프로덕트 클래스로부터 상속
		public String sid;

		public String getSid() {
			return sid;
		}

		public void setSid() { //pid넣는것이므로 매개변수가 필요없음 [= ()값)
			this.sid = super.pid; //상속받아서 super로 접근이 가능
										//super는 부모클래스(상속시켜주는 클래스)
		}
		//게터세터없이 하는법
		public String stage = super.style;
		
	
}
