package sec3;

import java.io.IOException;

public class SystemEx2 {

	public static void main(String[] args) throws IOException {
//Scanner = 데이터 입력
//키보드 제어 (아스키코드값을 읽어와야함) = System.in.read
		//유니코드에는 아스키코드가 포함됨
		//유니코드 : 0(48) ~ z(122) 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz
		//13은 윈도우 10은 MAC 엔터
		//System.in.read(); : 받은 키보드 입력정보를 10진수 정수인 아스키 코드값으로 반환한다.
		//int a = System.in.read();
		int speed = 0;
		int keyCode = 0 ;
		while(true){
			if(keyCode != 13 && keyCode !=10){
				if(keyCode == 49) {//숫자 1을 누르면
					speed++;
				}else if(keyCode == 50){//숫자 2를 누르면
					speed--;
				}else if(keyCode == 51){//숫자 3을 누르면
					System.out.println(speed);
				}else if(keyCode == 52){//숫자 4를 누르면
					System.out.println("종료");
					break;
				}
			}
			keyCode = System.in.read();
//			if(speed>=120)System.out.println("시속이 120이 넘었습니다");
			
		}
		
		System.out.println(System.in.read());
	}

}
