package sec2;

public class Example2 {

	public static void main(String[] args) {
		//문자열 길이
		String data = "호뇰룔룔료";
		int len = data.length();
		System.out.println(data);
		System.out.println("data의 글자 수 : "+data.length());
		System.out.println("data의 글자 수 : "+len);
		
		//문자열 전체변경
		data = "호뉼률률류 라랄라~!라랄라~!";
		System.out.println(data);
		System.out.println(data.length());
		//문자열 일부변경
		data = data.replace("라랄라", "오예");
		System.out.println(data);
		System.out.println(data.length());
		data = data.replace("~!", "");
		System.out.println(data);
		System.out.println(data.length());
		
		//문자의 특정 구간을 갖고오기
		String ju = "920711-2208033";
		String year = ju.substring(0, 2);//0,1이 아닌이유는 (시작, 여기 전까지)라서
		String month = ju.substring(2,4);
		String day = ju.substring(4,6);
		System.out.printf("%s년%s월%s일\n",year,month,day);
		
		//특정 문자의 위치찾기
		int pos = ju.indexOf("-");
		System.out.println("-의 위치는 : "+pos+"입니다");
		int pos2 =ju.indexOf("*");
		if(pos2<0){
			System.out.println("유효하지않은 입력값");
		}
		System.out.println(pos2); //없는 위치값을 입력하면 -1출력
		
		//문자열 분리 - token
		String dates = "1992-07-11";
		String names = "강아지-고양이-너구리-라쿤";
		
		//문자열의 배열로 분리 - 문자열에서 특정구분자(token)을 기준으로 또 다른 여러문자열로 분리
		String[] date = dates.split("-"); //split : 쪼개다
		String name[]=names.split("-");
		//x.length : 문자열 배열의 길이
		for(int i=0;i<date.length;i++){//문자열의 배열의 배열이기때문에 length가 아닌
			System.out.println(date[i]);
		}
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]);
		}
	}

}
