package homework;

public class MemberService {
		String login;
		String id;
		String password;
		String logout;
		
		public MemberService(){
		
		}
		
		public MemberService(String id, String password){
			this.id=id;
			this.password=password;
		}
		
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getLogout() {
			return logout;
		}
		public void setLogout(String logout) {
			this.logout = logout;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}


		public boolean login(String id, String password) {
			if(id=="hong" && password=="12345"){
				System.out.print(id);
				return true;
			}else{
			
			return false;
			}
		}
		public void logout(String id){
			System.out.println(id+"님이 로그아웃 되었습니다.");
		}
		
		
		
}
