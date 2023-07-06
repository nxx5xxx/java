package sec3;

public class Descendant extends Parent{
//public class Descendant extends Child //Child클래스가 final이라 상속불가
		private String root; //루트는 시조라는 뜻

		public String getRoot() {
			return root;
		}

		public void setRoot(String root) {
			this.root = root;
		}
		

}
