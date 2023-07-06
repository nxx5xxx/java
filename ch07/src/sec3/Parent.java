package sec3;

public class Parent {
	//필드엔 static을 걸수있지만 메소드에는 static불가
		private String lastName; //성
		private String firstName;
		private int age;
		//private에는 접근흘 할 수 없으니 게터세터를 넣어야함
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		//자식에게 변화를 허용할경우
		public void getPrint(){
			System.out.println("부모");
		}
		
		//자식에게 변화를 허용하고싶지 않음
		public final void outPut(){
			System.out.println("부모님은 바뀌지않는다");
		}
}
