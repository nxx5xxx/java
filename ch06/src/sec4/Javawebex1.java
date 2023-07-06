package sec4;

public class Javawebex1 {

	public static void main(String[] args) {
		JavaWeb j1 =new JavaWeb();
		JavaWeb j2 =new JavaWeb();
		JavaWeb j3 =new JavaWeb();
		
		
		j1.dm =	"테스트";
		j2.dm = "테스트2";
		j3.dm = "테스트3";
		
		j1.partName = "C언어";
		j2.partName = "자바";
		j3.partName = "파이썬";
		//공유하는것이라 마지막에 초기화 한값으로 다 바뀐다.
		System.out.println("j1 : "+j1.dm);
		System.out.println("j2 : "+j2.dm);
		System.out.println("j3 : "+j3.dm);
		System.out.println("JavaWeb.dm : "+JavaWeb.dm); //즉 스태틱이 걸린건 굳이 객체생성이 필요하지않다
		System.out.println("j1 partName : "+j1.partName);
		System.out.println("j2 partName : "+j2.partName);
		System.out.println("j3 partName : "+j3.partName);
//		System.out.println("JavaWeb.partName : "+JavaWeb.partName); //이것은 출력이 불가능

		JavaWeb j5,j6 = new JavaWeb();
		j6.dm = "테스트6";
	//	j5.dm ="테스트5"; //마지막에 초기화 한것은 가능하지만 그앞에것은 불가능
		System.out.println(j6.dm);
		
	}

}
