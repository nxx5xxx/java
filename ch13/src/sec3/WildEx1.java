package sec3;
//581p
public class WildEx1 {

	public static void main(String[] args) {
		Course.regCourse1(new Applicant<Person>(new Person()));
		Course.regCourse1(new Applicant<Worker>(new Worker()));
		Course.regCourse1(new Applicant<Student>(new Student()));
		Course.regCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.regCourse1(new Applicant<HighStudent>(new HighStudent()));
		
		//Student 와 그의 자식들만 가능
//		Course.regCourse2(new Applicant<Person>(new Person()));
//		Course.regCourse2(new Applicant<Worker>(new Worker()));
		Course.regCourse2(new Applicant<Student>(new Student()));
		Course.regCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.regCourse2(new Applicant<HighStudent>(new HighStudent()));
		
		//Worker와 그의 부모만 가능
//			public static void regCourse3(Applicant <? super Worker> applicant)
//														new Applicant<클래스명> (매개변수)
		Course.regCourse3(new Applicant<Person>(new Person()));
		Course.regCourse3(new Applicant<Worker>(new Worker()));
//		Course.regCourse3(new Applicant<Student>(new Student()));
//		Course.regCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
//		Course.regCourse3(new Applicant<HighStudent>(new HighStudent()));

	}

}
