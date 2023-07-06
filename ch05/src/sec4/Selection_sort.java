package sec4;

public class Selection_sort {

	public static void main(String[] args) {
		int[] arr={70,50,90,80,40,60};
		//=> {40,50,60,70,80,90}오름차순
		//=> {90,80,70,60,50,40}내림차순
		//오름차순으로 그 결과를 정렬하여 출력
		int orm;
					//강사님 답안에는 int n=arr.length를 하여 x<n-1 , y<n 으로하심
		for(int x=0;x<arr.length;x++){
			for(int y=(x+1);y<arr.length;y++){
				if(arr[x]>arr[y]){
					orm=arr[x];
					arr[x]=arr[y];
					arr[y]=orm;
				}
			}
		}
		for(int data:arr){
			System.out.println(data);
		}

/*		
		//selection sort (선택정렬) - 중요
		int tmp;
			for(int i=0;i<5;i++){
				for(int j=(i+1);j<6;j++){
					if(arr[i]>arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					}
				}
			}
			for(int data:arr){
			System.out.println(data);
			}
			*/
	}	

}
