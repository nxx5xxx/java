package sec1;

public class Example1 {

	public static void main(String[] args) {
		// 제어문 : 조건분기문, 반복문, 기타 제어문 으로 구성되며, 프로그램 실행의 흐름을 제어하는 문장
		// 구조적 프로그래밍 언어는 구조적으로 되어있다(순차적)

		// 조건분기문 : 입력되어지는 데이터의 조건 만족 여부에 따라 실행 내용을 달리 하도록 하는 문장
		// 조건에 따라 나뉘어지는(분기) 문장
		// if~문 , switch~문
		
		//if
		int point = 80;
		
		//삼항 연산자 (제어문보다는 삼항연산자가 더 빠름)
		//String res = (point >= 90) ? "우수" : "보통";
		//연사자일뿐 조건분기문은 아님 --간단한것만 가능
		
		//삼항연산자
		String res = "";
		res = (point >= 90) ? "우수" : "보통";
		
		//조건분기문 ( 한줄if문 )
		String res2 ="보통";
		if (point>=90) res2 = "우수";
		//단순할땐 이렇게 한줄로 쓸 수 있지만
		
		
		//실행할 문장이 두줄 이상의 if문
		String res3 = "보통";
		int bonus=0;
		if(point>=90){
			res3="우수";
			bonus = 10;
		}
		//여러줄이 될 경우 {}블록을 씌어주엉서 여러개를 실행가능
		
		
		//조건식이 만족하지 않을 때와 만족할때를 나타내는 if문
		String res4 ="";
		if(point>=90	){
			res4="우수";
		} else//if(point>=90)을 만족하지 않을때 
		{
			res4="보통";
		}
		//res4는 값을 null로 설정해줘서 else를 넣어 값을넣었다
		
	
	
	}

}
