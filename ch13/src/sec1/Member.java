package sec1;

public class Member <T,E>{//타입파라미터를 선언한것을 <>안에 다 넣어줘야함
		//T로 타입파라미터 멤버이름 first second
		private T first;
		private E second;
		public T getFirst() {
			return first;
		}
		public void setFirst(T first) {
			this.first = first;
		}
		public E getSecond() {
			return second;
		}
		public void setSecond(E second) {
			this.second = second;
		}
		
		
}
