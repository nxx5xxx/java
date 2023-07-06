package sec1;

public class Example6 {

	public static void main(String[] args) {
/*
		String data = "C";
		//yield -> 자바 12버전이후 추가된문법(옐드)

 		int num =switch(data){
		case"A" ->100;
		case "B" ->80;
		case "C" ->60;
		} //break;없이 data의 값이 A면 100대입 B면 80대입 :값은 60이 나옴
*/
		 float num1 = (float) Math.random(); //0<=x<1의 실수를 구하는 메소드
		 int num = (int) (Math.random()*6)+1; //1~6을 무작위(랜덤) 임의의수를 대입
		 int n45 = (int) (Math.random()*45)+1; //45를 포함한 그 사이의 임의의수를 대입
		 System.out.println(num);
		 //가위바위보 만들기 가능
		 
		 
		 if(num ==1 || num ==2){
			 System.out.println("하위수");
		 }else if(num== 3 || num==4){
			 System.out.println("중위수");
		 }else {
			 System.out.println("상위수");
		 }
		 
		 //==
		 
		 switch(num){
		 			case 1:
		 			case 2:
		 				System.out.println("하위수");
		 				break;
		 			case 3:
		 			case 4:
		 				System.out.println("중위수");
		 				break;
		 			default:		 			
		 				System.out.println("상위수");
		 }
		 
	}

}
