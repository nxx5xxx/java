package homework;

public class Account {

		private int balance; //마음대로 변경못함=게터세터
		static final int MIN_BALANCE = 0; //상수 0
		final static int MAX_BALCANCE = 1000000; //상수 백만
		
		
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			if(MIN_BALANCE>balance){
				
			}else if(MAX_BALCANCE<balance){
				
			}else{
				this.balance = balance;
			}
		}

		

}
