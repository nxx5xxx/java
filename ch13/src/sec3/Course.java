package sec3;

public class Course {
	
	//여기서 ?를 와일드카드라한다
	//모든사람이 신청가능
	public static void regCourse1(Applicant<?> applicant){
				System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course1을 등록함");
	}
	
	//학생만 등록 가능 //Student를 포함한 자식클래스
	public static void regCourse2(Applicant<? extends Student> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course2를 등록함");
	}
	
	//워커 또는 Person만 가능//Worker를 포함한 슈퍼클래스(부모)
	public static void regCourse3(Applicant <? super Worker> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName()+"이 Couse3를 등록함");
	}
	
	
}
