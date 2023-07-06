package sec1;

public class Body {
	//멤버필드
	String style = "세단";
	String frendar = "앵글";
	String bumper = "쉐드";
	@Override
	
	//출력메소드
	public String toString() {
		return "Body [style=" + style + ", frendar=" + frendar + ", bumper="
				+ bumper + "]";
		
	//메소드
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getFrendar() {
		return frendar;
	}
	public void setFrendar(String frendar) {
		this.frendar = frendar;
	}
	public String getBumper() {
		return bumper;
	}
	public void setBumper(String bumper) {
		this.bumper = bumper;
	}

	
	
}
