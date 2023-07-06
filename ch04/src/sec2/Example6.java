package sec2;

public class Example6 {

	public static void main(String[] args) {
		//제어문의 끝.
		//continue , break
		int n = 0;
		int sum = 0; 
		for(;;){//무한루프
			n++;
			sum+=n;
			if(n>=100) break; //n이 100보다 크거나 같다면 break(이 루프를 깨겠다)하겠다
		}
		System.out.println("0~100의합계 : " +sum);
		//break;  : 무한루프 상에서 더이상 실행을 하지 않으려고 할 경우 중지 시키는 명령어
		//정지 : 목적지까지 갔기때문에 멈추는것
		//중지 : 목적지까지 도달하지않았지만 멈춘것
		
		sum=0;
		//continue :건너뛰기
		for(int i=0;i<=100;i++){
			if(i % 3 == 0 ) continue; //3의배수가 아닌값의 합계
			//3의 배수가 나오면 건너뛰어라
			sum+=i;
		}
		System.out.println("3의배수가 아닌값의 합계 : " +sum);
	}

}
