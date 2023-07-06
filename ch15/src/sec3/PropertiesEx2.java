package sec3;

import java.io.IOException;
import java.util.Properties;
//666p
public class PropertiesEx2 {

	public static void main(String[] args) {
		Properties pro = new Properties();
		try{
			pro.load(PropertiesEx2.class.getResourceAsStream("db.properties"));
			System.out.println("드라이버 : "+pro.get("driver"));
			System.out.println("URL : "+pro.getProperty("url"));
			System.out.println("사용자 이름 : "+pro.getProperty("username"));
			System.out.println("사용자 비번 : "+pro.getProperty("password"));
			pro.setProperty("username", "임꺽정");//키의값을 변경
			System.out.println();
			System.out.println("사용자 이름 : "+pro.getProperty("username"));
		}catch(IOException e){
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		}
		

	}

}
