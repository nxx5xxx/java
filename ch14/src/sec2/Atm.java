package sec2;
//실시간은 거의 쓰레드라고 보면된다
//notify();가 있어야 (notify가 있다는건 비선점형 즉, 순차적으로 진행한다는 뜻)
//wait();나 sleep();을 호출
public class Atm implements Runnable{
	private long depositeMoney =10000; //잔액설정
	//wait() : 비선점형(순차적실행) 에서 기다림 발생->notify():쓰레드에게 기다림을 통보
	@Override
	public void run() {
		synchronized(this){ //synchronized는 동기화 : 동작성이 같은걸 묶어준다하여 동기화 블록이라 함
			for(int i=0;i<10;i++){
				notify();//wait()을 호출
				try{
					wait();
					Thread.sleep(2000);//쓰레드 2초 일시정지
				}catch(Exception e){
					e.printStackTrace();
				}
				if(getDepositeMoney() <= 0)break;
				withDraw(1000);
			}
		}
		
	}
	
	public void withDraw(long howMuch){//출금
		if(getDepositeMoney() > 0){
			depositeMoney -=howMuch;
			System.out.println(Thread.currentThread().getName()+", ");
			System.out.printf("잔액 : %,d 원 %n", getDepositeMoney());
		}else{
			System.out.println(Thread.currentThread().getName()+", ");
			System.out.println("잔액이 부족합니다.");
			
			
		}
		
		
	}
	public long getDepositeMoney(){//잔액반환
		return depositeMoney;
	}

}
