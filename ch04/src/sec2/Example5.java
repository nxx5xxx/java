package sec2;

public class Example5 {

	public static void main(String[] args) {
		//do~ while~
		/*
		do {
			반복실행할문자1;
			증감식;
			반복실행할문장2;
		}while(조건식);
		*/
		//조건식이 만족하든 안하든 do내부에있는 실행을 1번이상 실행함
		//=실행부터 하고 조건식을 비교함
		int x=0;
		int y=0;
		//do~while~
		do{
			x++;
			y+=x;
		}while(x>=10);
		System.out.println(y);

		//while~
		x=0;
		y=0;
		while(x>=10){
			x++;
			y+=x;
		}
		System.out.println(y);
	}

}
