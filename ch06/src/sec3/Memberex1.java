package sec3;

//다른 패키지에있는 클래스를 불러오기
import sec1.Car;
public class Memberex1 {

	public static void main(String[] args) {
	//private를 넣어서 직접접근 불가.
		Member mb1=new Member();//생성자함수를 넣었을경우 아무것도 안넣은경우를 잡지않으면 오류가 남
		mb1.setId("dragonee"); //이 객체를 Dao,VO라 함
		mb1.setPw("1234");
		mb1.setName("드래곤");
		mb1.setTel("031-555-4444");
		mb1.setEmail("abcd@naver.com");
		//tostring을 햇기때문에 tostring가능 (오버라이딩)
		System.out.println(mb1.toString());
		Member mb2=new Member();
		mb2=mb1; //같은타입이어야 전달이 가능함
		System.out.println(mb2.toString());
		Member mb3=new Member("shamcat","3456","고양이","052-996-5524","defg@naver.com");
		System.out.println(mb3.toString());
		
	}

}
