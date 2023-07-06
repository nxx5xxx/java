package oracle;
//오라클 sql과 자바 연동
public class Member {
	private int seq; 			//member_seq
	private String no;			//c_no
	private String name;      //C_NAME      
	private String phone;     //PHONE       
	private String address;  //ADDRESS     
	private String reg;        	//REGIST_DATE 
	private String type;       	//C_TYPE
	//toString()과 Getter,Setter잡아줌
	
	@Override
	public String toString() {
		return "Member [seq=" + seq + ", no=" + no + ", name=" + name
				+ ", phone=" + phone + ", address=" + address + ", reg=" + reg
				+ ", type=" + type + "]";
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}

  
  
  
  
