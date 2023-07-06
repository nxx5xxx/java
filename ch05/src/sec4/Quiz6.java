package sec4;

public class Quiz6 {
//석차구하기
	public static void main(String[] args) {
		int[] score = {90,80,70,85,75,95};
		int[] rank = {1,1,1,1,1,1};
		for(int i=0;i<score.length;i++){//석차를 구하는 사람의 점수
			for(int j=0;j<score.length;j++){//비교를 하는 사람점수
				if(score[i]<score[j])rank[i]++;
			}
			System.out.printf("점수 : %d, 석차 : %d\n",score[i], rank[i]);
		}
	}

}
