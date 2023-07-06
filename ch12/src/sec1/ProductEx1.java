package sec1;

public class ProductEx1 {

	public static void main(String[] args) {
		Product pro1 = new Product(1, "빠다코코넛");
		Product pro2 = new Product(2, "에이스");
		
		Product pro3;
		try {
			pro3 = pro1.clone(); //깊은복제 : 주소가 다름
			
		} catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		Product pro4 = pro1; // 앝은복제 주소를 복사
		
		
		System.out.println("pro1과 pro2의 equal : "+pro1.equals(pro2));
//		System.out.println(pro1.hashCode()); // 10진수로 변환한것 366712642
//		System.out.println(pro1.toString()); // sec1.Product라는 클래스로부터 출발했고 주소는 699db8
		//이것은 Object에서 기본제공코드 Product에서 오버라이드해서 다른값으로 바꿔줌
		System.out.println(pro1.hashCode()); // 1000으로 나눈 나머지를 넣어줘서 642가 출력됨
//		System.out.println(pro1.toString()); //해쉬코드도 366712642로 바꾼 주소의 16진수코드 282가 나옴
//		"no : " +this.no+", pname : " +this.pname ; to스트링의값을 이렇게 바꿔줘서
		System.out.println(pro1.toString()); //출력값이 바뀜
		
//		모든 클래스는 Object 클래스로부터 기본적으로 상속받는다.
		try {
				pro1.finalize();
		} catch(Throwable e){
				e.printStackTrace();
		} //자동으로 GC가됨
		//System.out.println(pro1.hashCode());
		
	}

}
