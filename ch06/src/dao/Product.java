package dao;

public class Product { //접근제한자
		public String name; 		//public - 상품명
		String pid; 					//defalut - 상품코드
		protected String style; 	//protected - 종류
		private int account;		//private - 개수
		
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPid() {
			return pid;
		}
		public void setPid(String pid) {
			this.pid = pid;
		}
		public String getStyle() {
			return style;
		}
		public void setStyle(String style) {
			this.style = style;
		}
		public int getAccount() {
			return account;
		}
		public void setAccount(int account) {
			this.account = account;
		}
		
}
//하나의 클래스 안에 여러개를 할수있지만 public클래스는 하나만
class Stuff extends Product /*Product 클래스로 부터 상속*/{ //class앞에 아무것도 없으므로 default
	public double gram;
}
