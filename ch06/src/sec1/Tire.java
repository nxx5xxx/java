package sec1;

public class Tire {
	//멤버필드
	String name ="금호타이어";
	int count = 4;
	
	//출력메소드
	@Override
	public String toString() {
		return "Tire [name=" + name + ", count=" + count + "]";
	}
	
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
