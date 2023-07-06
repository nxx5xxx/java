package sec2;

public class StepException {

	public static void main(String[] args) {
		//단계적으로 처리하기위한 예외
		try {
		String data = null;
		//data = "123";
		System.out.println(data.toString());
		int arr[]=new int[3]; 
		// arr[2] = 30;
		//arr[4]->arr[2] =30; 
		String data1 = "1004";
		String data2 = "김1004";
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		System.out.println("val1 = "+val1);
		System.out.println("val2 = "+val2);
		
		} catch(NullPointerException e1){
			System.out.println("Null값을 가진 내용이 존재합니다.");
		} catch(IndexOutOfBoundsException e2){
			System.out.println("배열의 인덱스 범위를 초과하였습니다.");
		} catch(NumberFormatException e3){
			System.out.println("숫자로 처리할 수 없는 데이터가 존재합니다.");
		} catch(ClassCastException e4){
			System.out.println("형번환이 되지 않는 내용이 존재합니다.");
		} catch(Exception e5){
			e5.printStackTrace();
			System.out.println("지정하지않은 예외사항이 존재합니다");
		}
	}

}
