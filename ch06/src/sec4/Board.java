package sec4;

import java.util.Date;



public class Board {
	static String title = "여기는 제목";
	static String content = "여기는 내용";
	static String con;
	static Date resdate;
	static String author = "관리자";
	static String allData;
	//content 내용 , con , Date resdate , author 관리자 , allData
	
	
	static { //정적블록(스태틱블록) - 그다지쓸일은없다 
	con = title + content;
	allData = con+author;
	}
	
	public static void outputData(){//정적(static) 메소드(method)
		System.out.println("title : "+title);
		System.out.println("content : "+content);
		System.out.println("resdate : "+resdate);
		System.out.println("author : "+author);
		
	}
	
}
