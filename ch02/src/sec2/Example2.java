package sec2;

public class Example2 {

	public static void main(String[] args) {
			//자동 형변환 : 작은>큰
			byte a = 10 ;
			short b = a;
			int c = b;
			float d =c ;
			long e = (long) d; //강제 형변환 :  실수>정수로 변환시 소수점 이하가 유실될수 있기에 자동형변환 불가
			double f = e;
//			long e = d ;//불가
			//강제 형변환은 형변환 연산자로 함
			
	}

}
