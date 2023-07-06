package sec3;

public class TransTime {

	public static void main(String[] args) {
		//현재시간
		//currentTimemills는 1970년 1월 1일 00:00:00.000 을 기준으로한 현재 시간의 차이를 long형으로 반환한다.
		//nanoTime은 JVM상의 시간이고 시스템 상의 시간이 아님
		long time = System.nanoTime();
		long time2 = 1671408000;
		System.out.println(time);
		time= time2*1000000-time;
		System.out.println(time);

	}

}
