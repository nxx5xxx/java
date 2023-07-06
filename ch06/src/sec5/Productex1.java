package sec5;

import dao.Product; //다른 패키지에있는 클래스를 불러올때
import dao.Services;
//패키지명.클래스이름 ; 
//1차패키지명.2차패키지명.클래스명;

// import dao.Stuff //Stuff 클래스는 default 접근제한 클래스이므로 다른클래스에서 사용 불가.

public class Productex1 /* extends Product  1 . Product로부터 상속*/{

	public static void main(String[] args) {
		Product pro1 = new Product(); //여기서 Ctrl+Shift+O를해도 임포트가 알아서 생성된다
		pro1.name = "꿀꽈배기"; //public이라 접근가능
		//pro1.pid = "0321"; //pid는 접근제한이 defalut이므로 같은 패키지 내 에서만 접근이 가능하다
									//현재 Productex1은 sec5 고 product패키지는 dao패키지에있다
		
		//pro1.style = "과자 "; //접근제한이 protected일 경우 상속관계나 포함관계일 경우 접근이 가능하다
		//pro1.account = 10;	//private 일 경우 현재 클래스에서만 접근이 가능
		//이것들을 이용하기 위해 게터와 세터를 사용
		//즉 접근제한이 걸려있을경우 게터와 세터를 이용해서 사용
		//Product에 게터와 세터를 생성 후
		pro1.setPid("9923051");
		pro1.setStyle("과자");
		pro1.setAccount(10);
		System.out.println("상품 명 : "+pro1.getName());
		System.out.println("상품 코드 : "+pro1.getPid());
		System.out.println("품목 : "+pro1.getStyle());
		System.out.println("수량 : "+pro1.getAccount());
		
		//Stuff sf1 = new Stuff();
		/*
		   	public : 클래스 , 필드, 생성자, 메소드 사용가능 - 다른패키지에서도 import를 통해 접근가능
		 	protected : 필드 , 생성자, 메소드 사용가능 - 다른 패키지여도 상속관계에 있는 클래스에서 접근이 가능
		 	default : 클래스, 필드 , 생성자, 메소드 사용가능 - 같은패키지 일때만 접근이 가능
		 	private : 필드, 생성자, 메소드 사용가능 - 같은 클래스 내에서만 접근이 가능, 일반적으로는 public 타입을 갖고있는 게터와 세터를 이용하여 접근
		 	//즉 클래스를 사용가능한것은 public과 default 
		 	교재 262p 참조
		 */
		Services s1 =new Services();
		s1.name = "";
		s1.stage = "";
		s1.setSid();
		//s1.Pid("?");//불가
	}

}
