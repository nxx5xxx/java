package sec3;

public class Studentex1 {

	public static void main(String[] args) {
		
		//출력get
		//입력set
		
		Student st1=new Student();

		st1.setName("강아지");
		st1.setAge(5);
		st1.setDb(90);
		st1.setPg(100);
		st1.setUi(94);
		Student st2=new Student("고양이",10,78,92,68); //위의 값처럼 각각 할수도있고 이것처럼 한꺼번에 입력도 가능하다
		Student st3=new Student("이구아나",8,62,25,95);
		st1.setAvg();
		st1.setTot();
		System.out.println("학생명\t나이\tDB\tPg\tUi\t총점\t평균\t학점");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n",st1.getName(),st1.getAge(),st1.getDb(),st1.getPg(),st1.getUi(),st1.getTot(),st1.getAvg(),st1.getHak());
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n",st2.getName(),st2.getAge(),st2.getDb(),st2.getPg(),st2.getUi(),st2.getTot(),st2.getAvg(),st2.getHak());
		//setAvg와 setTot를 하지않으면 총점과 평균이 0으로 나오고 그로인해 학점도 F가 나오게된다
		System.out.println("\t\tst2.setAvg 와 st2.setTot 를 한 후");
		st2.setAvg();
		st2.setTot();
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n",st2.getName(),st2.getAge(),st2.getDb(),st2.getPg(),st2.getUi(),st2.getTot(),st2.getAvg(),st2.getHak());
		st3.setAvg();
		st3.setTot();
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n",st3.getName(),st3.getAge(),st3.getDb(),st3.getPg(),st3.getUi(),st3.getTot(),st3.getAvg(),st3.getHak());
	}

}
