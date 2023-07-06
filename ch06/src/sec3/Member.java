package sec3;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String email;
	
/*	
 * 생성자가 있어야지 Member mb3=new Member("shamcat","3456","고양이","052-996-5524","defg@naver.com");
 * 와 같은 형태를 만들수 있으나
 * 이 형태로 만들경우 mb1에서 오류가 난다
 * 
	public Member(String id, String pw, String name, String tel, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
*/
	//mb1의 오류를 잡기위해 생성자함수를 집어넣은것
	public Member() {}
	public Member(String id, String pw, String name, String tel, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	@Override
	public String toString() {
		return "회원  :  [id=" + id + ", pw=" + pw + ", name=" + name + ", tel="
				+ tel + ", email=" + email + "]";
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
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
	
	
	
	
}
