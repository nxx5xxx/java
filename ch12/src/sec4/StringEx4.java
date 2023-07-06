package sec4;
//멀티 쓰레드=> StringBuffer
public class StringEx4 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("홍길동");
		System.out.println(sb);
		sb.append("이야아아아압");
		System.out.println(sb);
		
		StringBuffer sf= new StringBuffer("임꺽정");
		sf.append("으야아아아압");
		System.out.println(sf);
		sf.insert(3, " " );
		System.out.println(sf);
		sf.delete(3, 8);
		System.out.println(sf);
		sf.reverse();
		System.out.println(sf);
		//배열처럼 쓰지만 스트링이라 length가 아닌 length()로쓰임
		System.out.println(sf.length());
		System.out.println(sf.substring(2,5));
	}

}
