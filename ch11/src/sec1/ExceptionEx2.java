package sec1;

public class ExceptionEx2 {

	public static void main(String[] args) {
		int arr[]=new int[3]; //arr[0]~arr[2]
//		for(int x=0;x<=3;x++){
//				arr[x]=x;
//				System.out.println(arr[x]);
//		}
		
		
			for(int x=0;x<=3;x++){
					try {
							arr[x]=x;
							System.out.println(arr[x]);
					} catch(ArrayIndexOutOfBoundsException e){
							break; //break를걸면 오류구문을 보는게아니라 for가 더이상 실행되지않는다 - 예외처리
						//1    e.printStackTrace();
					}
			}
//		1출력시
//			0
//			1
//			2
//			java.lang.ArrayIndexOutOfBoundsException: 3
//				at sec1.ExceptionEx2.main(ExceptionEx2.java:15)
//			가 뜨게되는데 3번째 인덱스의 값이 비어있다는의미
			
			
	}

}
