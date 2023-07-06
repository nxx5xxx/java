package homework;

public class Parent {
	public String nation;
	
	public void Parent(){
		//this("대한민국");
		//객체 생성후 Parent.nation으로 호출을 하거나 객체생성시(안에 이름 넣으면 그거대로 변함)
		System.out.println("Parent() call");
	}
	
	public void Parent(String nation){
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
