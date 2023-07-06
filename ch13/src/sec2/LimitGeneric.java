package sec2;
//타입이 제한된 제네릭(범용 클래스)
//숫자타입이나 , 문자 , 논리값의 타입만 허용하도록 하는 범용클래스
public class LimitGeneric<N extends Number> { //상속받은것의 상속받은것과 , 그 자손들만 만들수 있음 - 즉 상속받지않은것은 제한
	public N field1;
}
