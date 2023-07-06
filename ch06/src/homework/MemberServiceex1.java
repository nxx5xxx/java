package homework;

public class MemberServiceex1 {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong","12345");
		
//		System.out.println(memberService.id);
//	    System.out.println(memberService.login);
		if(result){
			System.out.println("님 로그인되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id또는 password가 올바르지 않습니다.");
		}
	}

}
