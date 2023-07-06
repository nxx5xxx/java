package sec1;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("컴퓨터 일반 점수 :");
		int edps = sc.nextInt();

		System.out.println("스프레드시트 일반 점수 :");
		int sp = sc.nextInt();

		System.out.println("데이터베이스 일반 점수 :");
		int db = sc.nextInt();
		
		//컴퓨터 일반, 스프레드시트일반 ,데이터베이스일반 점수를 변수로 입력받아
		//평균이 96~100 A+, 93~95 A0 , 90~92 A-
		//			86~89 B+, 83~85 B0, 80~82 B-
		//			76~79 C+, 73~75 C0, 70~72 C-
		//평균이 66~69 D+, 63~65 D0, 60~62 D-
		//평균이 60 미만이면 F
		
		//if~else if~else 문으로 학점(hak)을 계산
		int tot=edps+sp+db;
		float avg=tot/3.0f;
		String hak="";
		if(avg>=90){
			hak="A";
		}else if(avg>=80){
			hak="B";
		}else if(avg>=70){
			hak="C";
		}else if(avg>=60){
			hak="D";
		}else{
			hak="F";
		}
		
		//if((int) avg%10>=6)
		//if~else if~else 문으로 평균의 나머지를 정수로 바꾸어 +,0,- 를 hak추가
		if(avg<60){

		}else if(avg==100){
		   hak = hak + "+";	
		}else if((int)avg%10>=6){
			hak = hak +"+";
		}else if((int)avg%10>=3){
			hak = hak +"0";
		}else{
			hak = hak +"-";
		}
		
		//if((int) avg == 100) hak = "A+"
		//if((int) avg < 60) hak = "F";
		
		System.out.println("학점은 : "+hak);
		
		sc.close();
	}

}
