package sec2;

public class LimitGenericEx1 {

	public static void main(String[] args) {
		LimitGeneric<Integer> a1 = new LimitGeneric<>();
		a1.field1 = 4567;
		LimitGeneric<Integer> a2 = new LimitGeneric<>();
		a2.field1 = 1234;
//		리미트제너릭 클래스에서 상속받은것은 java.lang안에있는 Number클래스이므로 스트링은 불가능하다
//		LimitGeneric<String> a3 = new LimitGeneric<>();
		System.out.println(a1.field1);
		System.out.println(a2.field1);

	}

}
