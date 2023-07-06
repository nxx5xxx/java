package sec3;

public class BoardEx1 {

	public static void main(String[] args) {
		WildGeneric<Board> n1 = new WildGeneric<>();
		WildGeneric<Notice> n2 = new WildGeneric<Notice>();
		WildGeneric<DataRoom> n3 = new WildGeneric<DataRoom>();
		//WildGeneric<Qna> n4 = new WildGeneric<>(); //보드에 의해 상속받은게 아니라 사용불가 -WildGeneric은 보드를 상속받음

	}

}
