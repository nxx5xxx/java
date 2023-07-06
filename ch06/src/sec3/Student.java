package sec3;

public class Student {
	private String name; //[접근제한자] [지시자] 데이터타입 필드명 [= 값];
	private int age;
	private int pg;
	private int db;
	private int ui;
	private int tot;
	private double avg;
	
	public Student() { this("학생"); } //public 생성자명(=클래스랑같음) ([매개변수타입 매개변수명]) {실행문;}
	public Student(String name){this(name, 25);}
	public Student(String name,int age){this(name, age,95);}
	public Student(String name,int age,int pg){this(name, age,pg,90);}
	public Student(String name,int age,int pg,int db){this(name, age,pg,db,88);}
	public Student(String name,int age,int pg,int db,int ui){
		this.name =name;
		this.age=age;
		this.pg=pg;
		this.db=db;
		this.ui=ui;
		
		
	} //멤버 메소드: [접근제한자] 반환타입 메소드명([매개변수타입 매개변수명]) {실행내용; 반환타입값;}
	//반환타입과 반환타입값은 같아야한다(int 면 return도 int값)
	//반환타입이 void면 return은 없음
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPg() {
		return pg;
	}
	public void setPg(int pg) {
		this.pg = pg;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getUi() {
		return ui;
	}
	public void setUi(int ui) {
		this.ui = ui;
	}
	public int getTot() {
		return tot;
	}
	public void setTot() {
		this.tot = this.db+this.ui+this.pg;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg =   (this.db+this.ui+this.pg)/3.0f; //this.tot/3.0f; //이렇게할경우 0.00으로 출력됨
	}
	public String getHak(){ //setAvg를하여 avg값을 먼저 구해야 Hak이 작동가능
		String hak="";
		if(this.avg>=90){
			hak="A";
		}else if(this.avg>=80){
			hak="B";
		}else if(this.avg>=70){
			hak="C";
		}else if(this.avg>=60){
			hak="D";
		}else{
			hak="F";
		}
			
		return hak;
	}

	
	
}
