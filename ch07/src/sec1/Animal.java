package sec1;
//최상위 클래스인 Animal은 슈퍼클래스
public class Animal {
	private String type;
	private String name;
	private String color;
	private boolean spine; //척추유무
	private int leg;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public void howling(){
		System.out.println("동물이웁니다.");
	}
	
}
