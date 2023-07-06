package sec4;
//StringBuilder는 싱글쓰레드에서 쓰임 (하나의 저장소에서)
//자료를 공유하지않음
public class StringEx2 {

	public static void main(String[] args) {
		String data = "자바";
		String data2 = new StringBuilder().append("배우기").toString();
		System.out.println(data);
		System.out.println(data2);
		data = new StringBuilder().append("배우자").toString();
		
		System.out.println(data);
		
		String test1 = new StringBuilder()
		.append("DEF")//문자열을 끝에 추가
		.insert(0,"ABC")//지정위치서부터 문자열추가
		.delete(3, 5)//문자열 인덱스 2번재부터 4번째 전까지 삭제
		.toString();//완성된 문자열 반환
		System.out.println(test1);
		
		
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def");
		System.out.println(sb);
		

//			빌더명.replace(x,y," "); x부터 y전까지 " "로 바꾸기 (싹다 드래그해서 입력한다 생각하면됨)
		sb.replace(0, 3, "G");
		System.out.println(sb);
//			.substring(x , y ); 
		String sb_sb=sb.substring(0, 2);
		System.out.println(sb_sb);
		StringBuilder sb_rv=sb.reverse();//여기서도 리버스로 뒤집어짐
		System.out.println(sb_rv);
		//또는
		System.out.println(sb);
		sb.reverse();//여기서 한번 더 쓴 이유는 2번째줄 위에 StringBuilder sb_rv=sb.reverse(); 에서 리버스를 사용해서 뒤집혔기때문
		System.out.println(sb);
		System.out.println(sb.reverse());
	}

}

//참고사항
//생성자
//StringBuilder sb = new StringBuilder(): 객체 선언
//StringBuilder sb = new StringBuilder("aaa"): 문자열을 바로 넣을 수도 있다.
//주요 메소드
//.append(): 문자열을 추가한다. (sb.append("bbb"), sb.append(4))
//.insert(int offset, String str): offset 위치에 str을 추가한다. (sb.insert(2, "ccc"))
//.replace(): 첫번째와 두번째 파라미터로 받는 숫자 인덱스에 위치한 문자열을 대체한다. (.replace(3, 6, "ye"))
//.substring(int start, (int end)): 인덱싱. 파라미터가 하나라면 해당 인덱스부터 끝까지, 두개라면 시작점과 끝점-1 까지 인덱싱 (sb.substring(5), sb.substring(3, 7))
//.deleteCharAt(int index): 인덱스에 위치한 문자 하나를 삭제한다. (sb.deleteCharAt(3)) 
//.delete(int start, int end): start 부터 end-1 까지의 문자를 삭제한다. (sb.delete(3, sb.length()))
//.toString(): String으로 변환한다. (sb.toString())
//.reverse(): 해당 문자 전체를 뒤집는다. (sb.reverse())
//.setCharAt(int index, String s): index 위치의 문자를 s로 변경
//.setLength(int len): 문자열 길이 조정, 현재 문자열보다 길게 조정하면 공백으로 채워짐, 현재 문자열보다 짧게 조정하면 나머지 문자는 삭제
//.trimToSize(): 문자열이 저장된 char[] 배열 사이즈를 현재 문자열 길이와 동일하게 조정, String 클래스의 trim()이 앞 뒤 공백을 제거하는 것과 같이 공백 사이즈를 제공하는 것, 배열의 남는 사이즈는 공백이므로, 문자열 뒷부분의 공백을 모두 제거해준다고 보면 됨