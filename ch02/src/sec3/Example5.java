package sec3;

import java.util.Scanner;
//java폴더안에 util폴더안에 Scanner라는 클래스에 키보드입력값이 있다
//첫이름이 java나 javax의 경우 java에서 제공해주는 라이브러리이다 (확장자 ~.jar)
//example1을 갖고오고 싶을경우 import sec1.Example1;이라 치면된다
public class Example5 {

	public static void main(String[] args) {
		//키보드 입력
		Scanner sc = new Scanner(System.in); 
		//시스템은 기본적인 입출력을 의미, 입력(input) in 출력(output)은 out
		System.out.println("이름 입력 : ");
		String name = sc.nextLine(); //키보드가 깜빡이는(커서의 다음데이터)부터 입력해서 name에 저장하다
		//클래스는 앞글자가 대문자
		//스캐너로부터 sc라는 객체를 만들어서 사용 ex) int
		System.out.println("이름 : "+name);
		
		System.out.println("국어 점수 입력[0-100] : ");
		int kor = sc.nextInt();//입력한 데이터가 정수임을 알려주는것 nextInt , 실수는 nextfloat, 문자열은 nextLine

		System.out.println("수학 점수 입력[0-100] : ");
		int mat = sc.nextInt();

		System.out.println("영어 점수 입력[0-100] : ");
		int eng = sc.nextInt();

		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("수학 : "+mat);
		System.out.println("영어 : "+eng);
		System.out.println("총점 : "+(kor+mat+eng));
		System.out.println("평균 : "+((kor+mat+eng)/3.0f));
		
//		float avg;
//		avg = (kor+mat+eng)/3.0f;
//		System.out.println("평균 : "+avg);
	}

}
