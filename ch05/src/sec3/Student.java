package sec3;

public class Student {
		String name;
		int kor;
		int eng;
		int mat;
		//Student가 갖는 속성(필드,특성) : name,kor,eng,mat
		//특정속성에 값을 넣어주는걸 setter ,특정속성에서 값을 갖고오는걸 getter
		//오른쪽마우스클릭 > 소스(alt+shift+s) > generate getter and setter 를치면 게터와 세터를 다 갖고와줌
		//new 키워드는 객체를 만들때 쓰임
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getMat() {
			return mat;
		}
		public void setMat(int mat) {
			this.mat = mat;
		}
}
