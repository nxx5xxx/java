package sec1;

public class SampleEx2 extends Thread{
	int seq; //쓰레드 번호
	
	public SampleEx2 (int seq){
		this.seq = seq;
	}
	
	public void run(){
		try{
			Thread.sleep(3000); //쓰레드의 대기명령  - 밀리세컨드라 1000이 1초다
		}catch(Exception e){ //예외처리 될 경우
			System.out.println("쓰레드를 대기시키지 못했습니다.");
		}
		
		System.out.println(this.seq+"번 쓰레드가 실행중 입니다.");
	}
	
	
	public static void main(String[] args) {
		for(int x=0;x<10;x++){
			Thread t1 = new SampleEx2(x);
			t1.start();
		}
			System.out.println("메인 메소드 실행 시작");
	}

}
