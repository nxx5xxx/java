package sec2;
//import lombok.Setter;
//import lombok.Getter;
//import lombok.Data;
//Data안에 세터와 게터가 다 포함되어있으므로 데이터만 써도됨

//@Data
//@Setter
//@Getter
public class Board {
	private int bno;
	private String title;
	private int age;

}

/*	롬복 Data안에는
 * Getter, Setter, hashCode(), equals(), toString() 이 자동생성되고
 * 
 * @noArgConstructor : 기본(매개변수가 없는) 생성자 포함
 * @AllArgsConstructor : 모든 필드를 초기화 시키는 생성자 포함
 * ------모든 필드 초기화 클래스 객체명 = new 클래스(매개변수1 , 매개변수2) ; 
 * 
 * 
 * 
 * -------------------------여기부터가 Data안에 있는거랑 같은효과
 * @RequiredArgsConstructor
 * @Getter
 * @Setter
 * @EqualsAndHashCode : equals()와 hashCode()메소드 포함
 * @ToString
 * 
 * 등을 더 사용할수있다
 
 
 
 */
