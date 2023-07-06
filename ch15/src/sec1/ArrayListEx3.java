package sec1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx3 {

	public static void main(String[] args) {
		//점수입력, 목록, 삭제,편집,종료
		ArrayList<Student> stArr= new ArrayList<>();
		Boolean sw=true;
		Scanner sc = new Scanner(System.in);
		int num;
		int count=0;
		int rv_num;
		int rc_num;
		while(sw){
			System.out.println("작업번호 [1-5] : 1.점수입력 2.목록 3.삭제 4.편집 5.종료");
			num=sc.nextInt();
			sc.nextLine();
			switch(num){
					case 1:
						count++;
						Student st = new Student();
						st.setNo(count);
						System.out.println("이름 : ");
						st.setName(sc.nextLine());
						System.out.println("국어점수 : ");
						st.setKor(sc.nextInt());
						System.out.println("영어점수 : ");
						st.setEng(sc.nextInt());
						System.out.println("수학점수 : ");
						st.setMat(sc.nextInt());
						stArr.add(st);
						sc.nextLine();
					break;
					case 2:
						for(Student s:stArr){
							System.out.println(s);
						}
					break;
					case 3:
						System.out.println("삭제할 번호를 고르세요");
						rv_num=sc.nextInt();
						stArr.remove(rv_num-1);
						sc.nextLine();
						count--;
					break;
					case 4:
						System.out.println("위치를 편집할 번호를 고르세요");
						rc_num=sc.nextInt();
						sc.nextLine();
						stArr.remove(rc_num-1);
						Student st1 = new Student();
						st1.setNo(rc_num);
						System.out.println("이름 : ");
						st1.setName(sc.nextLine());
						System.out.println("국어점수 : ");
						st1.setKor(sc.nextInt());
						System.out.println("영어점수 : ");
						st1.setEng(sc.nextInt());
						System.out.println("수학점수 : ");
						st1.setMat(sc.nextInt());
						stArr.add(rc_num-1,st1);		
					break;
					case 5:
					break;
						
			}
		}

	}

}
