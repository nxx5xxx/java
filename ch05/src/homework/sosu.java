package homework;

public class sosu {

	public static void main(String[] args) {
		/*
		소수 = 1과 자기자신외의 수로 나뉘어지지 않음
				합성수 = 나눠지는수가 3가지 이상(1,자기자신,그외)
				그러므로

				2~N-1 까지 수 중에 나누어지는게  //N-1인 이유는 자기 자신으로는 당연히 나뉘어지므로
							//2부터 시작하는 이유는 1은 당연히 나뉘어지므로
				한가지라도 있으면 그수는 소수가 아님
				
				소수 1과 자기자신외에 수로 나눠지지않음
				합성수 1과 자기자신 외에 다른수로도 나뉘어짐
				그러므로 1로 나누는것 제외
				첫번째 for는 나 자신을 두고
				두번째 for는 나보다 작은애들을 두기
				단 1과 자기자신보다는 작아야함
	*/
		int pandan=0;
		for(int x=2;x<100;x++){
			for(int y=2;y<=(x-1);y++){
				//System.out.println("x="+x);
				//System.out.println("y="+y);
				if(x%y==0) {
					pandan=1;
					break;
				}	
			}
			if(pandan==0) System.out.println(x);
			
			pandan=0;
		}
		
	}

}
