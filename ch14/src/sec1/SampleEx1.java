package sec1;
//Thread : CPU가 실행 중인 작업(=프로세스)
//Thread 클래스로 부터 상속받은 경우는 반드시 run() 메소드를 만들어야 함
//run() 메소드를 실행시키려면 start() 메소드를 호출함
public class SampleEx1 extends Thread{
//쓰레드는 추상체
	public static void main(String[] args) {
		SampleEx1 t1 = new SampleEx1();
		t1.start(); //현재 클래스인 SampleEx1의 run()메소드가 실행됨

	}

	public void run(){
		System.out.println("쓰레드가 실행중 입니다.");
	}
}
