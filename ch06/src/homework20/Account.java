package homework20;

import java.util.Scanner;

public class Account {
	Scanner sc=new Scanner(System.in);
	private String acc_num;
	private String name;
	private long money;
	
	
	public String getAcc_num() {
		return acc_num;
	}

	public void setAcc_num(String acc_num) {
		this.acc_num = acc_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}
	
	public void Create(){
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		acc_num=this.sc.nextLine();
		System.out.print("계좌주 : ");
		name=this.sc.nextLine();
		System.out.print("계좌초기입금액 : ");
		money=this.sc.nextInt();
		System.out.println("결과 : 계좌가 생성되었습니다");
	}
	
	public void List(){
		System.out.printf("%-15s\t\t%-5s\t\t%-15d\t\n",this.getAcc_num(),this.getName(),this.getMoney());
	}
	
	public void Plusmoney(long value){
		this.money +=value;
	}
	
	public void Minusmoney(long value){
		this.money-=value;
		System.out.println("출금이 성공되었습니다.");
	}


}
