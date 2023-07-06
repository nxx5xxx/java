package sec1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx7 {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new FileReader("강아지.txt")); //외부파일에 접근이라 예외처리
		} catch (FileNotFoundException e) { //파일을 찾을수없을경우 예외처리
			System.out.println("해당 파일을 찾을수 없습니다.");
		}

	}

}
