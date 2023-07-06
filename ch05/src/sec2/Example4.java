package sec2;

public class Example4 {

	public static void main(String[] args) {
		String[] str1 = {"java", "python", "c-language"};
		String[] str2 = {"java",	"python","c-language"};
		String[] str3;
		str3 = str2; //얕은복제 : 같은 기억 장소를 가르키고있음(주소만복제)
		String[] str4 =new String[5];
		
		System.out.println(str1==str2); //주소비교로 인해 false
		System.out.println(str2==str3); //str3주소에 str2주소를 복사한거라 true
		System.out.println(str2);
		System.out.println(str3);
		//깊은복제 : 다른 기억장소를 가르키도록 데이터를 복제(데이터를 heap에 갖고옴)
		System.arraycopy(str2, 0, str4, 0, str2.length);//str2의 위치 0번째부터 복사를한다 str4의	0번째부터 붙여넣는다 str2의 길이까지
		System.out.println("\n"+str4);
		for(String data:str4){
			System.out.println(data);
		}
	}

}
