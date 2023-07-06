package sec4;

public class ImmutableEx1 {

	public static void main(String[] args) {
		MutablePerson mtp = new MutablePerson(25,"강아지");
		mtp.age = 23;
		mtp.name = "고양이";
		
		ImmutablePerson itp=new ImmutablePerson(25,"강아지");
//		itp.age = 32; 불가 프리베이트 파이날이라 불가
		System.out.println(itp.getAge()+itp.getName());
	}

}
