package sec4;

public class Boardex1 {

	public static void main(String[] args) {
		//static field나 static method는 객체 생성없이 사용할 것.
		//ex)  board1.outputData(); 하지말것
		//Board.outputData(); 로 할것 - 즉, 객체생성하지말고 직접사용
		Board board1 =new Board();
		Board board2 = new Board();
		board1.title = "제목연습";
		board1.content = "내용연습";
		System.out.println(board1.title);
		System.out.println(board1.content);
		
		System.out.println(board2.title);
		System.out.println(board1.con); //스태틱블록에 넣어둔건 바뀌지않음
		System.out.println(board2.allData);
		Board.outputData();
		
		
	}

}
