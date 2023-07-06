package sec1;

public class ExceptionEx4 {
	static class Animal{}
	static class Dog extends Animal{}
	static class Cat extends Animal{}
	public static void main(String[] args) {
// ClassCastException (형변환예외) : 바꿀수없는 형변환을 했을경우 예외발생
		Dog dog = new Dog();
		changeDog(dog);
		
//		Cat cat = new Cat();
//		changeDog(cat);  //형제끼리는 형변환이 불가능하기때문에 형변환에 대한 오류가 뜬다
		try {
			Cat cat = new Cat();
			changeDog(cat);
		} catch(ClassCastException e){
			System.out.println("형제끼리는 형변환이 불가능합니다");
		}
		
		
		
		
		
	}
	//캐스팅(형변환) 함수
	public static void changeDog(Animal animal){
			Dog  dog = (Dog) animal;
			
	}

}
