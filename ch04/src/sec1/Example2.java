package sec1;

import java.util.Scanner;
//Ctrl+shift+O


public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호입력[1-10] : ");
		int num = sc.nextInt();
		
		System.out.println("국어 점수 입력[1~100] : ");
		int kor = sc.nextInt();
		
		System.out.println("수학 점수 입력[1~100] : ");
		int mat = sc.nextInt();
		
		System.out.println("영어 점수 입력[1~100] : ");
		int eng = sc.nextInt();
		
		int tot = kor+mat+eng;
		float avg= tot/3.0f;
		
		String pon = "";
		//if~ 단순if
		
		//if~else~ 일반if
		//국어 , 수학, 영어 각 과목의 점수가 60점 이상이고, 평균이 80점 이상이면 합격
		if(kor>=60 && eng>=60 && mat>=60 && avg>=80) //&&AND문은 셋다 만족해야함
		{
			pon = "합격";
			System.out.println(pon);
		}
		else {
			pon ="불합격";
		
		System.out.println(pon);
		}
		//참고(remark)는 국어, 영어, 수학 점수 중에서 하나라도 90 이상이면, "과목우수", 아니면 ""처리
		String remark = "";
		if(kor>=90 || mat>=90 || eng>=90) //OR문은 셋중 하나만 만족해도됨
		{
			remark = "과목우수";
			System.out.println(remark);
		}else
		{
		System.out.println(remark);
		}

		//if~else if~else
		//만약, 평균이 90이상이면,  "A", 80이상이면 "B", 70이상이면 "C", 60이상이면 "D"
		//60점 미만이면 "F" //if (){} else if(){} else{}-- 다단계if라고함
		String hak="";
		if(avg>=90){
			hak="A";
			System.out.println(hak);
		}else if(avg>=80){
			hak="B";
			System.out.println(hak);
		}else if(avg>=70){
			hak="C";
			System.out.println(hak);
		}else if(avg>=60){
			hak="D";
			System.out.println(hak);
		}else{
			hak="F";
			System.out.println(hak);
		}
/*
		if(조건식1){
			조건식1을 만족했을때 출력
		}else if(조건식2){
			조건식 1을 만족하지않고 조건식2를 만족했을때
		}else if(조건식3){
			조건식2를 만족하지않고 조건식3를 만족했을때
		}else{
			어떤 조건식도 만족하지 못했을경우
		}
 
 

*/
		//번호 , 국어 , 영어 ,수학, 총점, 평균 ,판정, 참고사항, 학점을 모두 출력하시오.
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t판정\t참고사항\t학점");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s\t%s\t%s",num,kor,eng,mat,tot,avg,pon,remark,hak);
		
		sc.close();
	}

}
