package sec1;

public class Engine {
	//멤버필드
	String fuel="가솔린"; //연료
	int cc=3000; //연료량
	int displace=4;//배기량
	
	//출력메소드
	@Override //이미 있는 값에 덮어씌우기때문에 오버라이드가 써있다
	public String toString() {
		return "Engine [fuel=" + fuel + ", cc=" + cc + ", displace=" + displace
				+ "]";
	}
	
	//메소드
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getDisplace() {
		return displace;
	}
	public void setDisplace(int displace) {
		this.displace = displace;
	}
	
	

}
