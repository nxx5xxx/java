package sec4;

public class Quiz1 {

	public static void main(String[] args) {
		//강사님풀이식
		int[] array ={1,5,3,8,2};
		int max = 0;
		for(int i=0; i<array.length;i++){
			if(max<array[i]){
				max= array[i];
			}
		}
		System.out.println("최대값 : "+max);
	}

}
