package sec1;

import java.util.ArrayList;
//멀티쓰레드
//threads.add(객체명) 은 쓰레드를 추가하는것 (멀티쓰레드라 함)
public class SampleEx3 extends Thread{
	int seq; //쓰레드 개수
	public SampleEx3(int seq){
		this.seq = seq;
	}
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
		for(int i = 0 ; i < 10 ; i ++){
			Thread t1 = new SampleEx3(i);
			t1.start();
			threads.add(t1); //쓰레드 추가 발생
		}
		
		
		for(int i=0; i<threads.size();i++){
			Thread t2 = threads.get(i);
			try{	//모든쓰레드가 시작될때까지 기다린다
				t2.join(); // t2 의 쓰레드가 종료될때까지 기다린다
			}catch(Exception e){
				
			}
			System.out.println("메인메소드 종료");
		}
		
	}

}
