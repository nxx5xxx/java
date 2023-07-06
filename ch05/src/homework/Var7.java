package homework;

public class Var7 {

	public static void main(String[] args) {
		//배열의 최대값
		int[] array = { 1, 5, 3, 8, 2} ;
		int max=0;
		for(int x:array){
			if(x>max)max=x;
		}System.out.println(max);
	}
}
