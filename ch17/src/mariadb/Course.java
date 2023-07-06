package mariadb;
//DTO객체라고함
public class Course {
	private String id;
	private String name;
	private int cre;
	private String lec;
	private int week;
	private int s_h;
	private int e_h;
	@Override
	public String toString() {
		return "course [id=" + id + " name=" + name + " cre=" + cre
				+ " lec=" + lec + " week=" + week + " s_h=" + s_h + " e_h="
				+ e_h + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCre() {
		return cre;
	}
	public void setCre(int cre) {
		this.cre = cre;
	}
	public String getLec() {
		return lec;
	}
	public void setLec(String lec) {
		this.lec = lec;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getS_h() {
		return s_h;
	}
	public void setS_h(int s_h) {
		this.s_h = s_h;
	}
	public int getE_h() {
		return e_h;
	}
	public void setE_h(int e_h) {
		this.e_h = e_h;
	}
	
	
}
