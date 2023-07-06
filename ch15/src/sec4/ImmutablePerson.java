package sec4;
//객체생성시에만 값이 저장되고, 그 값을 변경 할 수 없도록 하는 컬렉션프레임워크
//ImmutablePerson imp = new ImmutablePerson(25,"오");
//Immutable Collection FrameWork
//각 필드가 private final로 구성하고, 각 필드의 접근을 위한 세터를 만들지않는다.
public class ImmutablePerson {
	private final int age;
	private final String name;
	//생성자로 만들때 값만 넣기가능
	public ImmutablePerson(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
}
