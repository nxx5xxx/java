package sec1;

import java.util.ArrayList;
//Thread클래스는 Runnable 인터페이스의 자식 클래스임
//Multi Thread에서는 Runnable 인터페이스가 해당하는 내용이 반드시 기술되도록 만드므로 쓰레드의 제어가
//훨씬 부드럽고, 간결하게 처리 될 수 있다.
public class SampleEx4 implements Runnable{
	int seq; //쓰레드 개수
	public SampleEx4(int seq){
		this.seq = seq;
	}
	@Override
	public void run(){
		System.out.println(this.seq+"번 쓰레드 시작");
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			
		}
		System.out.println(this.seq+"번 쓰레드 종료");
	}
	
	public static void main(String[] args) {
		System.out.println("메인 메소드 시작");
		ArrayList<Thread> threads = new ArrayList<>();
		for(int i=0; i<10;i++){
			Thread t1 = new Thread(new SampleEx4(i)); //쓰레드는 Runnable의 자식임을 알수있다
			t1.start();
			threads.add(t1);//쓰레드 추가 발생
		}
		for(int i=0;i<threads.size();i++){
			Thread t2 = threads.get(i);
			try{
				t2.join();
			}catch(Exception e){
				
			}
		}
		
		System.out.println("메인 메소드 종료");
	}

}
