package sec2;

public class Example1 {

	public static void main(String[] args) {
		// 반복실행문(=반복수행문) : 특정 조건이 만족하는동안 반복실행하는 문장
		// for~, while~, do ~while (자바,자바스크립트,C동일)
		// 반복실행문 부터는 로직이라함
		// 알고리즘은 로직을 갖고 뭔가를 설계(해결하기위해)
		//for(i=0; i<=10; i++){} == for(초기값, 조건식, 증감식)
		int i=0;
		int sum=0;
		boolean b=true;
		
		
				while(b){
					if(i<=10){
						sum+=i;
						System.out.println(i);
						i++;//카운트변수
					}else{
						System.out.println(sum+"\n");
						b=false;
					}
				}
				
				
				sum=0;
				for(int n=0; n<=100; n+=2){//i :지역변수 여기 안에서만 유효
					sum+=n;
				} System.out.println(sum); //0~100까지 짝수의합계
				
				//==위아래는 같은식이나 위에는 50번만 더하면돼서 위에값이 더 빠름
				sum=0;
				for(int n=0; n<=100; n++){
					if (n % 2 == 0 ) sum+=n;
				}System.out.println(sum);
				
				sum=0;
				for(int n=1; n<=100; n+=2){
					sum+=n;
				}System.out.println(sum);//홀수의합계
				
				sum=0;
				for(int n=0; n<=100; n++){
					if (n % 2 != 0 ) sum+=n;
				}System.out.println(sum);//홀수의합계
	}

}
