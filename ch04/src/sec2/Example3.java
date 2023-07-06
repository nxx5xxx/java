package sec2;

public class Example3 {

	public static void main(String[] args) {
		//99단(2~9단까지)
		for(int x=2	; x<10; x++){
			for(int y=1; y<10; y++){
				System.out.printf("%d*%d=%d\n",x,y,x*y);
			}
		}
		
		//가로배열로
		for(int x=2	; x<10; x++){
			for(int y=1; y<10; y++){
				System.out.printf("%d*%d=%d\t",x,y,x*y);
			}System.out.println();
		}
		System.out.println();
		//다른방식 가로배열로
		for(int x=1	; x<10; x++){
			for(int y=2; y<10; y++){
				System.out.printf("%d*%d=%d\t",y,x,y*x);
			}System.out.println();
		}
	}

}
