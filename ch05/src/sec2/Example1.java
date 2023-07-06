package sec2;

public class Example1 {

	public static void main(String[] args) {
		//문자열과 문자 배열
		String str1 = "java program";
		char[] c_arr = {'j','a','v','a',' ','p','r','o','g','r','a','m'};
		System.out.println(str1);
		//str1.length(); : 글자수
		//c_arr.length(); : 배열의 개수
		
		
				//개별요소접근
				for(char data : c_arr ){ //문자배열
						System.out.print(data);
				}System.out.println();
				
				for(int i=0;i<str1.length();i++){ //문자열
					System.out.print("'"+str1.charAt(i)+"' ");//charAt은 해당 글자의 개별요소 
				}
				System.out.println();
				
				//charAt사용법
				String jumin = "991205-2022544";
				char m = jumin.charAt(7); //jumin의 7번째 글자를 갖고와라(0부터 시작해서 7번째가 2임)
				System.out.println(m);
				//int n = Integer.parseInt(jumin.charAt(7)); ----안됨
				//주민번호로 성별나누기
					switch(m){
						case '1':
						case '3':
							System.out.println("남자");
							break;
						case '2':
						case '4':
							System.out.println("여자");
							break;
						default:
							System.out.println("외국인");	
					}

	}

}

/*
		배열출력방법1
		for(int x=0;x<c_arr.length;x++){
			System.out.print(c_arr[x]+"\t");
		}System.out.println();
		
		배열출력방법2
		System.out.println(c_arr);
*/