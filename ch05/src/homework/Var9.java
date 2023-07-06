package homework;

import java.util.Scanner;

public class Var9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner sc2 = new Scanner(System.in); nextint쓸라면 이것도 추가해야함
		int person[]=new int[0];
		int p=0, score=0,sum=0, max=0, avr=0;
		boolean w=true;
		while(w){
					System.out.println("--------------------------------------------------");
					System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
					System.out.println("--------------------------------------------------");
					System.out.print("선택> ");
					int num = Integer.parseInt(sc.nextLine());
					switch(num){
							case 1:
								System.out.print("학생수>");
								p = Integer.parseInt(sc.nextLine());
								person=new int[p];
								System.out.println();
							break;
							case 2:
								for(int x=0;x<person.length;x++){
									System.out.printf("%d 번 학생 점수입력>: ",x+1);
									person[x]=Integer.parseInt(sc.nextLine());
									sum+=person[x];
									if(person[x]>max) max=person[x];
								}
							break;
							case 3:
								for(int x=0;x<person.length;x++){
									System.out.printf("%d 번 학생의 점수는 : %d\n",x+1,person[x]);
								}
							break;
							case 4:
								System.out.println("최고 점수 :"+max);
								System.out.println("평균 점수 :"+(float)(sum/p));
							break;
							case 5:
									System.out.println("프로그램 종료");
									w=false;
							break;
							default:
								System.out.println("다시입력 바랍니다.");
								
					}
							
		}
	}

}
