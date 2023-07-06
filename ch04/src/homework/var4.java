package homework;

public class var4 {

	public static void main(String[] args) {
		//두개 주사위 던져서 나오는눈을 (눈1,눈2)형태 출력 , 눈의합이 5면 실행멈추기
		System.out.println("주사위 두개의 합이 5 이면 멈춥니다");
		int x = (int) (Math.random()*6)+1;
		int y = (int) (Math.random()*6)+1;
		while((x+y)!=5){
			System.out.println("("+x+","+y+")");
			x = (int) (Math.random()*6)+1;
			y = (int) (Math.random()*6)+1;
		}
		System.out.println("("+x+","+y+")");

	}

}
