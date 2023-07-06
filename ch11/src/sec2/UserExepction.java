package sec2;
//사용자 익셉션
public class UserExepction extends Exception {
		public UserExepction(){ }
		public UserExepction(String msg){
			super(msg);
		}
}
