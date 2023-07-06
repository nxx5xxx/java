package sec3;

import java.io.IOException;
import java.util.Properties;

//프로펄티스는 특성 자원 이란뜻
//Properties는 Hashtable의 서브클래스이며, 자원에 대한 정보를 저장할 때 주로 사용하며, Map의 제네릭으로 선언할 수 없다.
//스프링이나 스프링부트에서 디펜덴싱걸어주는 파일이 될수있다(?)
//.load() 메소드에 의해 현재클러스로 특정.properties파일을 갖고온다
//try catch구문으로 감싸줘야함
//properties를 이용하여 환경설정정보를 갖고올수있음
public class PropertiesEx1 {

	public static void main(String[] args) {
		Properties pro=new Properties();
		try{
			pro.load(PropertiesEx1.class.getResourceAsStream("css.properties"));
			System.out.println("글자크기 : "+pro.getProperty("fontSize"));
			System.out.println("글자색 : "+pro.getProperty("color"));
			System.out.println("배경색 : "+pro.getProperty("backgroundcolor"));
			System.out.println("안여백 : "+pro.getProperty("margin"));
			System.out.println("바깥여백 : "+pro.getProperty("padding"));
			//.setProperty("키","값");으로 값변경가능
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
