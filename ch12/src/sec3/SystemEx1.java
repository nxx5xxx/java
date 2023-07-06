package sec3;

import java.util.Scanner;

public class SystemEx1 {

	public static void main(String[] args) {
		//System.out.println()은 system의 하위패키지인 out객체에 있는 println이다
		
		//System.err.println() : 콘솔 에러 내용을 출력 (빨간글씨로 나옴)
		//ex)
		try {
			int num = Integer.parseInt("A1234");
		} catch(Exception e){
			System.err.println("에러발생");
			System.err.println(e.getMessage());
		}
		
		//System.in   입력
		//System.out 출력
		System.out.println("내용 입력 : ");
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		System.out.println("입력된 내용 : "+msg);
		
		//System.exit() : 시스템종료
		if(msg.equals("종료")){
			System.exit(0);
		}
		//currentTimemills는 1970년 1월 1일 00:00:00.000 을 기준으로한 현제 시간의 차이를 long형으로 반환한다.
		//nanoTime은 JVM상의 시간이고 시스템 상의 시간이 아님
		//System.currentTime() : 시스템의 현재시간
		//System.currentTimeMillis() : UTC 1970년 1월 1일 기준으로 현재시간과의 차이
		System.out.println(System.currentTimeMillis());
//		System.out.println("현재시간 : " +System.currentTime(객체));
		//System.nanoTime() : nanoTime은 JVM상의 시간이고 시스템 상의 시간이 아님
		System.out.println(System.nanoTime());
		
		//System.getProperty() : 시스템 운영체제의 사용자 정보 반환
//		System.out.println(System.getProperty(항목이름));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("user.dir"));
		
		
		//System.getenv() : 시스템 운영체제의 환경변수 정보 반환
		System.out.println(System.getenv()); //배열로 반환함
		
	}

}
