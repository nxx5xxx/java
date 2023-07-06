package homework;

public class Var8 {

	public static void main(String[] args) {
		int[][] array ={
				{95,86},
				{83,92,96},
				{78,83,93,87,88}	
		};
		//System.out.println(array.length); 1번째접근 -- array.length를 배웟으니 그걸 써야하지않을까
		//2번째접근 array.length 가 3차원배열일땐 array.length와 array[]의 차이점이 뭘까
		//그리고 x축과 y축을 구하려면 무엇을 봐야할까
		//array.length는 3을 나타내니 이것이 높이가 되겠구나
	  	//array[2].length가 5를  array[1].length가 3을 나타내니 이것이 길이가 맞겠네
		
		//3번째접근  중첩 for를 이용하라했고
		//배열의 순서는 array[0][0]은 95를 [0][1]은 86을 나타내니까
		//뒤에숫자를 나중에 배치해서 윗열부터 차례대로 나오게 해야겠다

		//5번째 접근 전체합과 평균을 구하라니까 하나만들어서 냅둬야지
		int sum=0;
		int avr=0;
		for(int x=0;x<array.length;x++){ 
					for(int y=0;y<array[x].length;y++){//3번째 접근에 의한 결과

						//System.out.println(array[x][y]); 4번째접근 잘 출력되나볼까? 잘되네 그럼이제 하나씩 차근차근 더해야지
						sum+=array[x][y];//하나씩 출력이 잘 되니까 그걸 하나씩 더하도록하자
						avr++;//평균을 구하기위해 전체 갯수를 알아야하니 평균을 나눠줄걸 하나 넣자
						
					}
			
		}
		System.out.println("전체 합 :"+sum);
		System.out.println("전체 평균:"+(float)sum/avr); //소수점이 나올수도 있으니 float으로 강제형변환시켜서 출력해야지
		
		
		
		
	}

}
