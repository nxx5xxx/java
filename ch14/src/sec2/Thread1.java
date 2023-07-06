package sec2;
//602p
public class Thread1 implements Runnable{
	int testnum=0;
	@Override//추상체를 상속받았으므로 오버라이드해야함
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(testnum+"번째쓰레드");
			if(Thread.currentThread().getName().equals("A")){//현재쓰레드의 이름을 갖고와서 A와 같는지 비교
				System.out.println("******************");
				testnum++;
			}
			System.out.println("ThreadName : "+Thread.currentThread().getName());//현재 쓰레드의 이름을 갖고온다는 뜻
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
